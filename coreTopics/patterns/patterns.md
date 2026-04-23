# DSA Patterns in Java

A collection of classic pattern programs to build intuition for nested loops — one of the most fundamental concepts in DSA.

---

## Core Idea

Before writing any pattern, answer these three questions:

1. **How many rows?** → Outer loop
2. **How many columns per row?** → Inner loop limit
3. **What to print each cell?** → The print statement

The outer loop controls the row, the inner loop controls what gets printed on that row. Once this clicks, every pattern becomes straightforward.

---

## Pattern 1 — Star Triangle

**Output:**
```
*
**
***
****
```

**Approach:**

I noticed that on row 1 we need 1 star, on row 2 we need 2 stars, and so on — the number of stars equals the row number. So I set the inner loop limit to `line` (the outer variable), and printed a star on each iteration.

```java
public static void star() {
    for (int line = 1; line <= 4; line++) {
        for (int star = 1; star <= line; star++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```

**Key takeaway:** When the inner loop limit equals the outer variable, you get a growing triangular pattern. This is the base template for almost every other pattern.

---

## Pattern 2 — Inverted Star Triangle

**Output:**
```
****
***
**
*

```

**Approach:**

This is Pattern 1 flipped. Instead of more stars each row, we need fewer. The trick is expressing a decreasing count — on row `i`, we want `n - i` stars. So the inner loop runs from `1` to `n - i`. As `i` increases, `n - i` decreases, giving the inverted shape.

```java
public static void invertedStar() {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j < n - i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```

**Key takeaway:** To invert a triangle, make the inner loop shrink instead of grow. The formula `n - i` is your go-to for decreasing ranges. Note that `j < n-i+1` is equivalent to `j <= n-i`.

---

## Pattern 3 — Half Pyramid with Numbers

**Output:**
```
1
12
123
1234
12345
...
```

**Approach:**

Same triangle shape as Pattern 1, but instead of printing a star I print `j` — the inner loop variable itself. Since `j` resets to `1` at the start of each row, every row begins from 1 and counts up to however many columns that row has.

```java
public static void HalfPyramid() {
    for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
```

**Key takeaway:** Printing `j` instead of `"*"` turns a star triangle into a number pyramid with zero structural change. The loop is identical — only what you print changes.

---

## Pattern 4 — Continuous Character Pattern

**Output:**
```
A
BC
DEF
GHIJ
KLMNO
```

**Approach:**

This one is different from the rest. The character must keep incrementing globally across all rows, not reset each row. So I declared `char ch = 'A'` **outside** both loops. Inside the inner loop, I print `ch` and then do `ch++`. Because `ch` is never reset, it flows continuously: A → B → C → D → ... across every row.

```java
public static void charracterPattern() {
    int n = 5;
    char ch = 'A';
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
```

**Key takeaway:** Scope matters. When state needs to persist across rows (like a continuing alphabet), declare it outside the outer loop. This is the key difference from Patterns 1–3 where everything resets each row.

---

## Common Mistakes

- Calling `println()` inside the inner loop — every character ends up on its own line
- Forgetting `println()` after the inner loop — all output runs together on one line
- Declaring `ch` inside the outer loop — it resets to `'A'` every row
- Mixing up `j <= i` and `j < i` — off-by-one errors that change the triangle shape

---

## What to Try Next

- **Full pyramid** — centered triangle using leading spaces
- **Diamond** — pyramid combined with an inverted pyramid
- **Floyd's triangle** — numbers that continue across rows (similar approach to Pattern 4)
- **Pascal's triangle** — each element is the sum of the two above it