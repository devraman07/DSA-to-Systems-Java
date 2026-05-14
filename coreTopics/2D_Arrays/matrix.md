🧠 Matrices in Java (2D Arrays)

A matrix is simply a 2D array where data is stored in rows and columns.

Matrices are one of the most important DSA topics because they appear everywhere:

Image processing
Data visualization
Game development
Machine learning
Backend analytics systems
📌 Core Idea of Matrix Problems

Before solving any matrix problem, always ask:

1. Am I traversing rows or columns?

Outer loop:

for(int i = 0; i < matrix.length; i++)

→ Rows

Inner loop:

for(int j = 0; j < matrix[i].length; j++)

→ Columns

2. Is traversal normal or directional?

Possible traversals:

Left → Right
Right → Left
Top → Bottom
Bottom → Top
Spiral
Diagonal
3. Is there boundary logic?

Many matrix problems rely on:

top
bottom
left
right
🔍 1. Find Largest Element in Matrix
💡 What It Does

Finds the maximum element in a matrix.

🧠 Logic

Traverse entire matrix:

Compare every element with:

largest

Update if larger value found.

⏱ Complexity
Time: O(n × m)
Space: O(1)
🌍 Real-World Use Case

Tags: #Analytics #Monitoring

Used in:

Peak CPU usage
Highest sales record
Maximum sensor value
⚠️ Common Mistakes
Initializing:
largest = 0

Fails for:

[-5, -10]

Correct:

Integer.MIN_VALUE
🔎 2. Find Smallest Element in Matrix
💡 What It Does

Finds minimum element.

🧠 Logic

Same traversal as largest element.

Use:

Integer.MAX_VALUE
⏱ Complexity
Time: O(n × m)
Space: O(1)
🌍 Real-World Use Case

Tags: #Monitoring #Optimization

Used in:

Minimum latency
Cheapest product
Lowest temperature reading
🌀 3. Spiral Matrix Traversal
💡 What It Does

Prints matrix in spiral order.

Example:

1 2 3
4 5 6
7 8 9

Output:

1 2 3 6 9 8 7 4 5
🧠 Logic

Maintain 4 boundaries:

startRow
endRow
startCol
endCol

Traverse:

Top row
Right column
Bottom row
Left column

Shrink boundaries after each round.

⏱ Complexity
Time: O(n × m)
Space: O(1)
🌍 Real-World Use Case

Tags: #GridTraversal #Robotics

Used in:

Robot movement
CCTV scanning
Image pixel traversal
⚠️ Bug in Your Code

Missing edge condition for bottom traversal.

You handled:

if(startCol == endCol)

But also need:

if(startRow == endRow)

Otherwise duplicates may print.

🔥 Key Insight

Spiral problems = boundary management.

➕ 4. Diagonal Sum
💡 What It Does

Finds sum of:

Primary diagonal
Secondary diagonal

Without double-counting center.

🧠 Logic

Primary:

matrix[i][i]

Secondary:

matrix[i][n - 1 - i]

Avoid duplicate:

if(i != antiCol)
⏱ Complexity
Time: O(n)
Space: O(1)
🌍 Real-World Use Case

Tags: #Analytics #ComputerVision

Used in:

Matrix scoring
Symmetry detection
Pixel importance
⚠️ Important Limitation

Works only for:

Square Matrix

Your example matrix:

2 × 3

❌ Not valid for diagonal sum.

🔍 5. Search in Sorted Matrix
💡 What It Does

Search target in sorted matrix efficiently.

🧠 Logic

Start from:

bottom-left

Then:

If larger:

move up

If smaller:

move right
⏱ Complexity
Time: O(n + m)
Space: O(1)
🌍 Real-World Use Case

Tags: #SearchOptimization #Database

Used in:

Searching sorted logs
Analytics dashboards
Database indexing
⚠️ Important Requirement

Matrix must be:

Row-wise sorted
Column-wise sorted

Otherwise logic fails.

🔁 6. Find Duplicate in Matrix
💡 What It Does

Checks duplicate occurrence of:

8

in matrix.

⚠️ Limitation in Your Code

Hardcoded value:

matrix[i][j] == 8

Better:

findDuplicate(matrix, target)

More reusable.

🌍 Real-World Use Case

Tags: #FraudDetection #Validation

Used in:

Duplicate transactions
Duplicate records
Inventory mismatch
⚠️ Logic Issue

count should reset per row.

Currently:

count

keeps accumulating globally.

➕ 7. Row Sum
💡 What It Does

Calculates sum of:

second row
⚠️ Limitation

Hardcoded:

matrix[1]

Better:

sum(matrix, row)

Reusable design.

🌍 Real-World Use Case

Tags: #Analytics #Reporting

Used in:

Daily sales total
User activity sum
Batch statistics
🔄 8. Transpose Matrix
💡 What It Does

Converts:

Rows → Columns
Columns → Rows

Example:

1 2 3
4 5 6

↓

1 4
2 5
3 6
🧠 Logic

Swap:

transposed[j][i]
=
matrix[i][j]
⏱ Complexity
Time: O(n × m)
Space: O(n × m)
🌍 Real-World Use Case

Tags: #ML #DataTransformation

Used in:

Machine learning
Image processing
Matrix mathematics
⚠️ Common Mistakes in Matrix Problems
❌ Wrong row/column boundaries
❌ Index out of bounds
❌ Forgetting edge cases
❌ Assuming square matrix
❌ Wrong directional traversal
🧠 Matrix Problem-Solving Framework

Ask:

1. Direction?
Horizontal
Vertical
Diagonal
Spiral
2. Boundaries?

Need:

top
bottom
left
right
3. Optimization?

Can brute force become:

O(n²)
→
O(n)
🚀 Real Engineering Insight

Matrices power:

Image filters
Recommendation systems
Heatmaps
AI/ML computations
Game boards
Dashboard analytics
🧠 Final Thought

Matrix problems are not about loops.
They are about structured traversal and boundary control.