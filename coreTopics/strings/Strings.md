# 🧠 Strings in Java

A collection of important string problems to build intuition for **text processing, pattern matching, traversal, and efficient string manipulation**.

Strings are one of the most important topics in DSA because modern systems heavily rely on text processing.

Examples include:

- 🔍 Search engines  
- 💬 Chat systems  
- 🔐 Authentication systems  
- 🤖 NLP & AI systems  
- 📄 Text formatting systems  

---

# 📌 Core Idea of Strings

Before solving any string problem, ask yourself:

### 1. What am I comparing?
- Characters?
- Words?
- Patterns?

---

### 2. Do I need traversal?
Most string problems involve:

```java
for(int i = 0; i < str.length(); i++)
```

---

### 3. Can I optimize?

Avoid:

```java
newStr += something
```

inside loops.

Prefer:

```java
StringBuilder
```

for better performance.

---

### 4. What pattern is being tested?

| Problem Type | Pattern |
|---|---|
| Palindrome | Two Pointers |
| Shortest Path | Coordinate Tracking |
| Compression | Frequency Count |
| Uppercase Conversion | Traversal + Conditions |

---

# 1️⃣ Palindrome Check

## 💡 Problem

Check whether a string reads the same forward and backward.

### Example

**Input:**

```text
racecar
```

**Output:**

```text
true
```

---

## 🧠 How I Solved It

Instead of reversing the string:

I compared:

- First character ↔ Last character
- Second character ↔ Second last character

and continued until the middle.

If any mismatch occurs:

```text
Not a palindrome
```

---

## Code

```java
public static boolean isPalinDrome(String str) {
    int n = str.length() / 2;

    for(int i = 0; i < n; i++) {
        if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
    }

    return true;
}
```

---

## ⏱ Complexity

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 🌍 Real World Engineering Use Case

Used in:

- DNA sequence analysis
- Text validation systems
- Symmetry detection
- Pattern recognition systems

---

## 🔥 Key Learning

This problem taught me:

> **Two-pointer thinking**

A very important interview pattern.

---

# 2️⃣ Shortest Path

## 💡 Problem

Given directions:

```text
N, S, E, W
```

Find the shortest distance from origin.

---

### Example

**Input:**

```text
WNEENESENNN
```

---

## 🧠 How I Solved It

I treated movement like coordinates on a graph.

Rules:

- North → `y++`
- South → `y--`
- East → `x++`
- West → `x--`

After reaching final position:

I used distance formula:

```text
√(x² + y²)
```

to find shortest distance.

---

## Code

```java
public static float getShortestPath(String path) {

    int x = 0;
    int y = 0;

    for(int i = 0; i < path.length(); i++) {

        char dir = path.charAt(i);

        if(dir == 'N') {
            y++;
        } else if(dir == 'S') {
            y--;
        } else if(dir == 'E') {
            x++;
        } else if(dir == 'W') {
            x--;
        }
    }

    int x2 = x * x;
    int y2 = y * y;

    return (float)Math.sqrt(x2 + y2);
}
```

---

## ⏱ Complexity

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 🌍 Real World Engineering Use Case

Used in:

- GPS systems
- Google Maps
- Drone navigation
- Robot movement systems
- Delivery tracking systems

---

## 🔥 Key Learning

This problem taught me:

> **Simulation + coordinate tracking**

Convert movement into mathematics.

---

# 3️⃣ Largest String in an Array

## 💡 Problem

Find the lexicographically largest string.

### Example

**Input:**

```text
["apple", "mango", "banana", "grapes"]
```

**Output:**

```text
mango
```

---

## 🧠 How I Solved It

I initialized:

```java
Largest = fruits[0]
```

Then used:

```java
compareTo()
```

to compare strings alphabetically.

If current string was greater:

I updated the largest value.

---

## Code

```java
public static String getlargestString(String fruits[]) {

    String Largest = fruits[0];

    for(int i = 1; i < fruits.length; i++) {

        if(Largest.compareTo(fruits[i]) < 0) {
            Largest = fruits[i];
        }
    }

    return Largest;
}
```

---

## ⏱ Complexity

**Time Complexity:** `O(n × m)`  
**Space Complexity:** `O(1)`

Where:

```text
m = average string length
```

---

## 🌍 Real World Engineering Use Case

Used in:

- Product sorting systems
- Search ranking
- Alphabetical filtering
- Data organization systems

---

## 🔥 Key Learning

I learned:

> **Lexicographical order ≠ longest string**

Example:

```text
zebra > mango
```

because alphabetical order matters.

---

# 4️⃣ Capitalize First Letter of Every Word

## 💡 Problem

Convert:

```text
hello world
```

to:

```text
Hello World
```

---

## 🧠 How I Solved It

Steps:

### Step 1
Capitalize first character.

### Step 2
Whenever I encounter:

```text
space
```

capitalize the next character.

I used:

```java
StringBuilder
```

because modifying strings repeatedly is expensive.

---

## Code

```java
public static void toUpperCase(String str) {

    StringBuilder sb = new StringBuilder();

    char ch = Character.toUpperCase(str.charAt(0));

    sb.append(ch);

    for(int i = 1; i < str.length(); i++) {

        if(str.charAt(i) == ' ' &&
           i < str.length() - 1) {

            sb.append(' ');
            i++;

            sb.append(
                Character.toUpperCase(
                    str.charAt(i)
                )
            );

        } else {
            sb.append(str.charAt(i));
        }
    }

    System.out.println(sb.toString());
}
```

---

## ⏱ Complexity

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## 🌍 Real World Engineering Use Case

Used in:

- Name formatting systems
- CMS editors
- Chat applications
- Document formatting

---

## 🔥 Key Learning

I learned:

> **StringBuilder is faster than repeated string concatenation**

because strings are immutable.

---

# 5️⃣ String Compression

## 💡 Problem

Compress repeated characters.

### Example

**Input:**

```text
aaabbccdee
```

**Output:**

```text
a3b2c2de2
```

---

## 🧠 How I Solved It

I counted repeated characters.

If consecutive characters matched:

```text
increase count
```

After repetition ended:

I added:

```text
character + frequency
```

to the new string.

---

## Code

```java
public static String Compress(String str) {

    String newStr = "";

    for(int i = 0; i < str.length(); i++) {

        Integer count = 1;

        while(i < str.length() - 1 &&
              str.charAt(i) == str.charAt(i + 1)) {

            count++;
            i++;
        }

        newStr += str.charAt(i);

        if(count > 1) {
            newStr += count.toString();
        }
    }

    return newStr;
}
```

---

## ⏱ Complexity

**Time Complexity:** `O(n²)`  
**Space Complexity:** `O(n)`

---

## 🚀 Optimization

Current approach uses:

```java
newStr +=
```

inside loop.

Better:

```java
StringBuilder
```

to reduce time complexity.

---

## 🌍 Real World Engineering Use Case

Used in:

- File compression
- Log storage optimization
- Data transfer optimization
- Storage systems

---

## 🔥 Key Learning

This problem taught me:

> **Reducing redundancy improves efficiency**

---

# 6️⃣ Count Vowels

## 💡 Problem

Count vowels in a string.

---

### Example

**Input:**

```text
hello world
```

**Output:**

```text
3
```

---

## 🧠 How I Solved It

I converted each character to lowercase:

```java
Character.toLowerCase()
```

Then checked:

```text
a, e, i, o, u
```

If matched:

```text
count++
```

---

## Code

```java
public static int countVowels(String str) {

    int count = 0;

    for(int i = 0; i < str.length(); i++) {

        char ch =
            Character.toLowerCase(
                str.charAt(i)
            );

        if(ch == 'a' ||
           ch == 'e' ||
           ch == 'i' ||
           ch == 'o' ||
           ch == 'u') {

            count++;
        }
    }

    return count;
}
```

---

## ⏱ Complexity

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 🌍 Real World Engineering Use Case

Used in:

- NLP systems
- Speech processing
- Text analytics
- Language detection systems

---

# ⚠️ Common Mistakes I Learned to Avoid

- Using `==` instead of `.equals()`
- Index out of bounds
- Ignoring uppercase/lowercase
- String concatenation inside loops
- Forgetting strings are immutable

---

# 🧠 Final Notes

### Today I Learned:

- String traversal
- Character comparison
- Coordinate simulation
- Lexicographical comparison
- Efficient text formatting
- Compression basics

Most importantly:

> **Strings are not just text problems. They are pattern recognition + efficient manipulation problems.**