# 🧠 Bit Manipulation in Java

A collection of important bit manipulation concepts and problems to build intuition for **binary operations, optimization, and low-level computation**.

Bit manipulation is one of the fastest and most optimized techniques in programming because operations happen directly on binary bits (`0` and `1`).

It is heavily used in:

- ⚡ High-performance systems
- 🔐 Cryptography
- 🖥️ Operating Systems
- 🎮 Game Engines
- 📡 Embedded Systems
- 🧠 Competitive Programming

---

# 📌 Core Idea of Bit Manipulation

Everything inside a computer is stored in:

```text
Binary → 0 and 1
```

Example:

```text
5 = 0101
10 = 1010
```

Instead of working with decimal numbers directly, bit manipulation allows us to work on **individual bits** efficiently.

---

# 🔢 Binary Number System

Binary numbers use base:

```text
2
```

Each position represents power of 2.

Example:

```text
13 = 1101
```

Calculation:

```text
1 × 2³ = 8
1 × 2² = 4
0 × 2¹ = 0
1 × 2⁰ = 1

Total = 13
```

---

# ⚙️ Bitwise Operators

| Operator | Meaning |
|----------|----------|
| `&` | AND |
| `|` | OR |
| `^` | XOR |
| `~` | One's Complement |
| `<<` | Left Shift |
| `>>` | Right Shift |

---

## 1️⃣ Bitwise AND (`&`)

Returns:

```text
1 only if both bits are 1
```

Example:

```text
5 = 0101
6 = 0110
------------
& = 0100
```

Output:

```text
4
```

---

## 2️⃣ Bitwise OR (`|`)

Returns:

```text
1 if at least one bit is 1
```

Example:

```text
5 = 0101
6 = 0110
------------
| = 0111
```

Output:

```text
7
```

---

## 3️⃣ Bitwise XOR (`^`)

Returns:

```text
1 if bits are different
```

Example:

```text
5 = 0101
6 = 0110
------------
^ = 0011
```

Output:

```text
3
```

---

## 4️⃣ One’s Complement (`~`)

Flips every bit.

Example:

```text
5 = 00000101
~5 = 11111010
```

Because Java uses:

```text
2's complement
```

Result becomes:

```text
-6
```

---

## 5️⃣ Left Shift (`<<`)

Shifts bits to left.

Formula:

```text
n << i = n × 2^i
```

Example:

```text
5 << 1

0101 → 1010
```

Output:

```text
10
```

---

## 6️⃣ Right Shift (`>>`)

Shifts bits to right.

Formula:

```text
n >> i = n / 2^i
```

Example:

```text
10 >> 1

1010 → 0101
```

Output:

```text
5
```

---

# 1️⃣ Odd or Even

## 💡 Problem

Check whether a number is odd or even.

---

## 🧠 How I Solved It

I used:

```java
n & 1
```

Why?

Because:

```text
Even → last bit = 0
Odd → last bit = 1
```

---

## Code

```java
public static void OddEven(int n) {
    int Bitcompare = 1;

    if((n & Bitcompare) == 0) {
        System.out.println("even");
    } else {
        System.out.println("odd");
    }
}
```

---

## ⏱ Complexity

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

---

## 🌍 Real World Engineering Use Case

Used in:

- Load balancing
- Memory allocation
- Hashing systems
- Even/Odd partitioning

---

# 2️⃣ Get i-th Bit

## 💡 Problem

Find the value of a specific bit.

---

## 🧠 How I Solved It

Created bitmask:

```text
1 << i
```

Then:

```text
n & bitmask
```

If result:

```text
0 → bit is OFF
1 → bit is ON
```

---

## Code

```java
public static int getithBit(int n, int i) {

    int bitmask = 1 << i;

    if((bitmask & n) == 0) {
        return 0;
    } else {
        return 1;
    }
}
```

---

## 🌍 Real World Engineering Use Case

Used in:

- Permission systems
- Feature flags
- Hardware control

Example:

```text
Admin permissions:
00101
```

Check access bit.

---

# 3️⃣ Set i-th Bit

## 💡 Problem

Turn ON a specific bit.

---

## 🧠 How I Solved It

Used:

```text
OR operation
```

because:

```text
x | 1 = 1
```

---

## Code

```java
public static int setithbit(int n, int i) {

    int bitmask = 1 << i;

    return n | bitmask;
}
```

---

## 🌍 Real World Engineering Use Case

Used in:

- Enable permissions
- Activate features
- Turn ON system flags

---

# 4️⃣ Clear i-th Bit

## 💡 Problem

Turn OFF a specific bit.

---

## 🧠 How I Solved It

Created mask:

```text
~(1 << i)
```

Then used:

```text
AND
```

---

## Code

```java
public static int clearithbit(int n, int i) {

    int bitmask = ~(1 << i);

    return n & bitmask;
}
```

---

## 🌍 Real World Engineering Use Case

Used in:

- Disable permissions
- Turn OFF switches
- Memory management

---

# 5️⃣ Update i-th Bit

## 💡 Problem

Update bit to:

```text
0 or 1
```

---

## 🧠 How I Solved It

If:

```text
newBit = 0
```

→ clear bit

Else:

```text
newBit = 1
```

→ set bit

---

## Code

```java
public static int updateithbit(
        int n,
        int i,
        int newBit
) {

    if(newBit == 0) {
        return clearithbit(n, i);
    } else {
        return setithbit(n, i);
    }
}
```

---

# 6️⃣ Clear Last i Bits

## 💡 Problem

Clear bits from right side.

---

## Formula

```text
(~0) << i
```

---

## Code

```java
public static int clearlastithbit(
        int n,
        int i
) {

    int bitmask = (~0) << i;

    return n & bitmask;
}
```

---

# 7️⃣ Clear Range of Bits

## 💡 Problem

Clear bits from:

```text
i → j
```

---

## 🧠 Logic

Create:

Left mask + Right mask

Combine using:

```text
OR
```

---

## Code

```java
public static int clearrangebits(
        int n,
        int i,
        int j
) {

    int a = ((~0) << (j+1));
    int b = (1 << i) - 1;

    int bitmask = a | b;

    return n & bitmask;
}
```

---

# 8️⃣ Power of Two

## 💡 Problem

Check if number is power of 2.

---

## 🧠 Logic

Power of 2 has:

```text
only one set bit
```

Formula:

```text
n & (n-1)
```

If result:

```text
0
```

Then:

```text
power of 2
```

---

## Code

```java
public static boolean ispoweroftwo(int n) {
    return (n & (n - 1)) == 0;
}
```

---

## 🌍 Real World Engineering Use Case

Used in:

- Memory allocation
- CPU optimization
- Buffer sizing

---

# 9️⃣ Count Set Bits

## 💡 Problem

Count number of:

```text
1s in binary
```

---

## Code

```java
public static int countsetbits(int n) {

    int count = 0;

    while(n > 0) {

        if((n & 1) != 0) {
            count++;
        }

        n = n >> 1;
    }

    return count;
}
```

---

## 🌍 Real World Engineering Use Case

Used in:

- Cryptography
- Permission counting
- Compression

---

# 🔟 Fast Exponentiation

## 💡 Problem

Find:

```text
a^n
```

efficiently.

---

## 🧠 Logic

Use binary representation of exponent.

If bit is:

```text
1
```

multiply answer.

Square number every step.

---

## Code

```java
public static int fastExpo(int a, int n) {

    int ans = 1;

    while(n > 0) {

        if((n & 1) != 0) {
            ans = ans * a;
        }

        a = a * a;
        n = n >> 1;
    }

    return ans;
}
```

---

## ⏱ Complexity

```text
O(log n)
```

---

## 🌍 Real World Engineering Use Case

Used in:

- Cryptography
- RSA encryption
- Scientific computing

---

# ⚠️ Common Mistakes

- Forgetting bit indexing starts from:

```text
0
```

- Confusing:

```text
<< multiplication
>> division
```

- Wrong parentheses:

❌

```java
1 << i + 1
```

✅

```java
1 << (i + 1)
```

- Forgetting negative numbers in complement

---

# 🧠 What I Learned Today

- Binary Number System
- Bitwise Operators
- One’s Complement
- Two’s Complement
- Left Shift
- Right Shift
- Get i-th Bit
- Set i-th Bit
- Clear i-th Bit
- Update Bit
- Count Set Bits
- Fast Exponentiation

Most importantly:

> Bit manipulation is about solving problems using binary logic for faster and more optimized computation.