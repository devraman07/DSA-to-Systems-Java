🧠 Arrays in Java – Core DSA Foundations

This module covers fundamental array operations that form the base of almost every backend system, algorithm, and optimization problem.

Arrays are used when:

Data is stored sequentially
Fast access is required
Memory locality matters
📌 Core Concepts Covered
Linear Search
Binary Search
Finding Largest Element
Reversing an Array
Pair Generation
Subarray Generation
🔍 1. Linear Search
💡 What It Does

Searches for an element by scanning the array one by one.

🧠 Logic
Traverse from index 0 → n-1
Compare each element with key
⚠️ Bug in Your Code
for(int i = 0; i <= numbers.length; i++)

❌ This causes ArrayIndexOutOfBoundsException

✅ Fix
for(int i = 0; i < numbers.length; i++)
⏱ Complexity
Time: O(n)
Space: O(1)
🌍 Real-World Use Case

Tags: #Search #BruteForce #Backend

Searching user in small dataset
Checking duplicates in logs
Validation checks
⚡ 2. Largest Element in Array
💡 What It Does

Finds the maximum value in an array.

🧠 Logic
Initialize with smallest possible value
Update when a larger element is found
⚠️ Issue

You declared smallest but didn’t use it.

⏱ Complexity
Time: O(n)
Space: O(1)
🌍 Real-World Use Case

Tags: #Analytics #Metrics

Finding peak CPU usage
Maximum transaction value
Highest scoring user
🔍 3. Binary Search
💡 What It Does

Efficient search in a sorted array

⚠️ Critical Bug in Your Code
int mid = start + end / 2;

❌ Wrong due to operator precedence

✅ Fix
int mid = start + (end - start) / 2;
🧠 Logic
Divide array into halves
Eliminate one half each step
⏱ Complexity
Time: O(log n)
Space: O(1)
🌍 Real-World Use Case

Tags: #SearchOptimization #Backend

Database indexing
Searching in sorted logs
Autocomplete systems
🔁 4. Reverse an Array
💡 What It Does

Reverses array in-place

🧠 Logic
Use two pointers:
start
end
Swap and move inward
⚠️ Minor Issue

Typo:

frist → first
⏱ Complexity
Time: O(n)
Space: O(1)
🌍 Real-World Use Case

Tags: #DataTransformation

Reversing logs
Undo operations
Data processing pipelines
🔗 5. Pairs in Array
💡 What It Does

Prints all possible pairs (i, j) where i < j

🧠 Logic
Outer loop → first element
Inner loop → remaining elements
⏱ Complexity
Time: O(n²)
Space: O(1)
🌍 Real-World Use Case

Tags: #Matching #Comparison

Comparing products
Checking all combinations
Brute-force similarity checks
📦 6. Subarrays
💡 What It Does

Prints all possible contiguous subarrays

🧠 Logic

3 loops:

Start index
End index
Print elements
⏱ Complexity
Time: O(n³)
Space: O(1)
🌍 Real-World Use Case

Tags: #Analytics #SlidingWindow

Finding trends in time-series data
Stock price analysis
Log pattern detection
⚠️ Common Mistakes in Arrays
❌ Using <= length instead of < length
❌ Wrong mid calculation in binary search
❌ Forgetting array must be sorted for binary search
❌ Off-by-one errors
❌ Not handling edge cases (empty array, single element)
🧠 Key Takeaways
1. Always Check Boundaries

Most bugs = index errors

2. Choose Right Algorithm
Problem	Best Approach
Small data	Linear Search
Sorted data	Binary Search
All combinations	Nested loops
3. Optimize Thinking
Start with brute force
Then optimize
🚀 Real Engineering Insight

Arrays are the foundation of:

Databases
Backend APIs
Caching systems
Data pipelines
🧠 Final Thought

If you master arrays, you unlock 50% of DSA.