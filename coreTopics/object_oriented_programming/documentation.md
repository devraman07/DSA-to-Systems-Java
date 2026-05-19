# 🧠 Object-Oriented Programming (OOP) in Java

A collection of important OOP concepts to build intuition for **real-world software design, scalability, and maintainable code**.

OOP helps organize code into reusable and structured components.

Used in:

- 🏦 Banking Systems  
- 🌐 Backend Development  
- 🎮 Game Development  
- 📱 Mobile Applications  
- 🏢 Enterprise Software  

---

# 📌 Core Idea of OOP

Instead of writing everything inside functions:

```text
Procedural Programming
```

OOP organizes code into:

```text
Objects + Classes
```

Real world:

```text
Car → Object
Car Blueprint → Class
```

---

# 1️⃣ Classes & Objects

## Class
A blueprint/template for creating objects.

Example:

```java
class Car {
    String color;
    int speed;
}
```

---

## Object
Real instance of a class.

```java
Car c1 = new Car();
```

### Real World Mapping

```text
Class → Blueprint
Object → Real Product
```

---

# 2️⃣ Access Modifiers

Controls accessibility.

| Modifier | Same Class | Package | Subclass | Outside Package |
|----------|-------------|----------|-----------|----------------|
| private | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ❌ |
| public | ✅ | ✅ | ✅ | ✅ |

### Rule

```text
private → safest
public → open access
```

---

# 3️⃣ Getters & Setters

Used to access private data safely.

Example:

```java
private int salary;

public int getSalary() {
    return salary;
}

public void setSalary(int salary) {
    this.salary = salary;
}
```

### Why?

```text
Encapsulation + Security
```

---

# 4️⃣ `this` Keyword

Refers to current object.

Example:

```java
this.name = name;
```

Used to remove confusion between:

```text
instance variable
vs
local variable
```

---

# 5️⃣ Encapsulation

Wrapping:

```text
data + methods
```

inside one unit.

Example:

```java
private data
+
public methods
```

### Why?

Protects data from direct access.

---

# 6️⃣ Constructors

Special methods used to initialize objects.

Runs automatically when object is created.

Example:

```java
Student s1 = new Student();
```

---

## Types of Constructors

### Non-Parameterized

```java
Student() {}
```

---

### Parameterized

```java
Student(String name) {
    this.name = name;
}
```

---

### Copy Constructor

Creates object using another object.

```java
Student(Student s1) {
    this.name = s1.name;
}
```

---

# 7️⃣ Constructor Overloading

Multiple constructors with different parameters.

Example:

```java
Student()

Student(String name)

Student(int age)
```

### Why?

Flexibility during object creation.

---

# 8️⃣ Shallow vs Deep Copy

## Shallow Copy

Copies reference.

```text
Changes affect original object
```

---

## Deep Copy

Creates new memory.

```text
Safe independent copy
```

---

# 9️⃣ Inheritance

Allows one class to inherit properties of another.

Example:

```java
class Animal {}

class Dog extends Animal {}
```

### Why?

```text
Code Reusability
```

---

## Types of Inheritance

### Single Level

```text
A → B
```

---

### Multi Level

```text
A → B → C
```

---

### Hierarchical

```text
      A
    /   \
   B     C
```

---

### Hybrid

Combination of inheritance.

---

### Multiple Inheritance

Java does not support through classes.

Supported using:

```text
Interfaces
```

---

# 🔟 Polymorphism

Means:

```text
One thing → many forms
```

---

## Method Overloading

Same method:

```text
Different parameters
```

Example:

```java
sum(int a, int b)

sum(float a, float b)
```

### Compile Time Polymorphism

---

## Method Overriding

Child class changes parent method.

Example:

```java
class Animal {
   void sound() {}
}

class Dog extends Animal {
   void sound() {}
}
```

### Runtime Polymorphism

---

# 1️⃣1️⃣ Packages in Java

Used to organize code.

## Built-in Package

Example:

```java
import java.util.*;
```

---

## User Defined Package

Example:

```java
package myPackage;
```

---

# 1️⃣2️⃣ Abstraction

Hides implementation details.

Shows only:

```text
essential functionality
```

Example:

```text
Car driving
(No need to know engine internals)
```

---

## Abstract Class

Cannot create object.

Can have:

```text
abstract methods
+
normal methods
```

Example:

```java
abstract class Animal {}
```

---

## Interface

Blueprint for complete abstraction.

Methods are:

```text
public + abstract
```

Example:

```java
interface Animal {}
```

---

### Difference

| Abstract Class | Interface |
|---|---|
| Constructor ✅ | ❌ |
| Normal Methods ✅ | ❌ |
| Multiple Inheritance ❌ | ✅ |

---

# 1️⃣3️⃣ `static` Keyword

Belongs to:

```text
Class
```

instead of object.

Example:

```java
static int count;
```

Shared by all objects.

---

# 1️⃣4️⃣ `super` Keyword

Refers to:

```text
Parent class
```

Example:

```java
super.color
```

Used to:

- access parent constructor
- access parent method
- access parent variable

---

# ⚠️ Common Mistakes

- Confusing object and class
- Using public everywhere
- Forgetting `this`
- Confusing overloading vs overriding
- Not understanding shallow copy
- Misusing inheritance
- Confusing interface vs abstract class

---

# 🌍 Real World Engineering Mapping

| OOP Concept | Real Use |
|---|---|
| Encapsulation | Banking apps |
| Inheritance | Vehicle systems |
| Polymorphism | Payment gateways |
| Abstraction | APIs |
| Interfaces | Multiple systems integration |
| Static | Shared configs |
| Super | Parent-child models |

---

# 🧠 What I Learned Today

- Classes & Objects
- Access Modifiers
- Getters & Setters
- `this` Keyword
- Encapsulation
- Constructors
- Constructor Overloading
- Copy Constructors
- Shallow & Deep Copy
- Inheritance
- Polymorphism
- Packages
- Abstraction
- Interfaces
- `static` Keyword
- `super` Keyword

---

# 🧠 Final Thought

> OOP is not just about classes and objects.  
> It is about designing software that is reusable, maintainable, and scalable.