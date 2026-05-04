🧠 Advanced Patterns in Java

This document explains advanced pattern problems used to build strong intuition for nested loops, symmetry, and state management.

These patterns are not about printing shapes—they train your brain to handle:

Grid-based logic
Boundary conditions
Symmetry & transformations
Real-world 2D problem solving
📌 Core Thinking Behind Patterns

Before solving any pattern, always ask:

What defines rows? → Outer loop
What defines columns? → Inner loop
What changes per row? → Pattern logic
Is there symmetry? → Split into parts
🧩 Patterns Breakdown

1. Hollow Rectangle
💡 What It Does

Prints only the boundary of a rectangle.

🧠 Logic
Print * only when:
First row
Last row
First column
Last column
⚠️ Common Mistakes
Forgetting j == cols (right boundary missing)
Printing full rectangle instead of hollow
Misplacing println()
🔥 Key Insight

Boundary problems = very common in real systems (edges of grids, matrices)

2. Inverted Rotated Half Pyramid
💡 What It Does

Right-aligned triangle using spaces + stars

🧠 Logic
Spaces → n - i
Stars → i
⚠️ Common Mistakes
Mixing order of loops (spaces must come first)
Off-by-one errors in spacing
🔥 Key Insight

Alignment problems = controlling spacing precisely

3. Inverted Half Pyramid with Numbers
💡 What It Does

Decreasing number pattern

🧠 Logic
Rows increase
Columns decrease → n - i + 1
⚠️ Common Mistakes
Using j <= i instead of decreasing logic
Forgetting +1 in formula
🔥 Key Insight

Shrinking loops = inverse patterns

4. Floyd’s Triangle
💡 What It Does

Continuous number sequence across rows

🧠 Logic
Use a global counter
Increment every print
⚠️ Common Mistakes
Resetting counter inside loop ❌
Incorrect increment placement
🔥 Key Insight

State persistence across loops (VERY IMPORTANT)

5. 0-1 Triangle
💡 What It Does

Prints alternating 0 and 1 based on position

🧠 Logic
(i + j) % 2 == 0 → 1
else → 0
⚠️ Common Mistakes
Using wrong condition (like i % 2)
Not understanding pattern dependency
🔥 Key Insight

Pattern depends on position, not iteration count

6. Butterfly Pattern
💡 What It Does

Symmetrical pattern (upper + lower half)

🧠 Logic
First half → increasing
Second half → decreasing
Mirror logic
⚠️ Common Mistakes
Forgetting second half
Wrong spacing: 2 * (n - i)
Misalignment issues
🔥 Key Insight

Complex patterns = split into simpler parts

7. Solid Rhombus
💡 What It Does

Shifted rectangle using spaces

🧠 Logic
Spaces → n - i
Stars → constant n
⚠️ Common Mistakes
Confusing with pyramid
Wrong number of spaces
🔥 Key Insight

Same structure, just shifted → transformation thinking

8. Hollow Rhombus
💡 What It Does

Boundary version of rhombus

🧠 Logic
Combine:
Space shifting
Boundary condition
⚠️ Common Mistakes
Mixing row/column boundaries
Losing shape alignment
🔥 Key Insight

Combining two concepts = real DSA thinking

9. Solid Diamond
💡 What It Does

Pyramid + inverted pyramid

🧠 Logic
First half → increasing
Second half → decreasing
⚠️ Common Mistakes
Duplicating middle row
Incorrect loop start for second half
🔥 Key Insight

Symmetry = split and mirror

⚠️ Common Mistakes Across All Patterns
❌ Off-by-one errors (<= vs <)
❌ Wrong loop start (0 vs 1)
❌ Misplacing println()
❌ Resetting variables incorrectly
❌ Not visualizing output before coding
🧠 What to Remember
1. Always Visualize First

Draw pattern on paper → then code

2. Break Problem into Parts
Spaces
Stars / Numbers
Symmetry
3. Identify Pattern Type
Pattern Type	Logic
Growing	j <= i
Shrinking	j <= n - i
Constant	j <= n
Symmetric	Split loops
4. Master These Formulas
n - i → spacing
2*i - 1 → pyramid width
(i + j) % 2 → alternating patterns
🚀 Real-World Connection

These patterns directly help in:

2D array traversal
Matrix problems
Game grid logic
UI grid rendering
Data visualization
🧠 Final Thought

Patterns are not about printing shapes.
They are about learning how to control structure, flow, and logic precisely.