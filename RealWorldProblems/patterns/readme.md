# Real-World Pattern Problems in Java

Applying nested loop patterns to real-world scenarios — grid processing, data visualization, and state management.

---

## Problem 1 — Server Load Heatmap

**Tags:** `#Analytics` `#DataVisualization` `#2DTraversal` `#NestedLoops` `#O(n²)` `#Medium`

### Real-World Scenario

Think of something like a GitHub contribution graph. You receive server load data for a week as a 2D array, where each value represents the load intensity at a given time slot:

```java
int[][] load = {
    {2, 4, 1, 3},
    {5, 1, 2, 4},
    {3, 3, 3, 2}
};
```

Your job is to convert raw numbers into visual symbols so the dashboard is readable at a glance.

| Symbol | Meaning     | Condition |
|--------|-------------|-----------|
| `.`    | Low load    | value ≤ 2 |
| `*`    | Medium load | value 3–4 |
| `#`    | High load   | value ≥ 5 |

**Expected Output:**
```
.*..
#..*
***.
```

### Approach

This is 2D array traversal — the outer loop walks the rows, the inner loop walks the columns. The only new ingredient compared to basic patterns is that instead of printing a fixed character, we print conditionally based on the cell value.

The key mental shift here: we're no longer printing based on loop position (`i` or `j`), we're printing based on **data** stored in the grid. This is how real analytics dashboards work.

```java
public static void ServerLoad() {
    int[][] load = {
        {2, 4, 1, 3},
        {5, 1, 2, 4},
        {3, 3, 3, 2}
    };

    for (int i = 0; i < load.length; i++) {
        for (int j = 0; j < load[i].length; j++) {
            if (load[i][j] <= 2) {
                System.out.print(".");
            } else if (load[i][j] < 4) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
        }
        System.out.println();
    }
}
```

> **Note on the condition:** The problem says medium is 3–4, but the code uses `load[i][j] < 4` (strictly less than 4), which means 4 falls into `#`. Watch your boundary conditions — off-by-one errors in conditionals are just as dangerous as in loop limits.

**Key takeaway:** 2D array traversal is nested loops where `i` indexes rows and `j` indexes columns. Swapping a hardcoded print for a conditional is what turns a pattern problem into a data-driven one.

---

## Problem 2 — Warehouse Slot Allocation

**Tags:** `#Logistics` `#GridSystem` `#Simulation` `#NestedLoops` `#StateManagement` `#Hard`

### Real-World Scenario

You're building a warehouse management system. Racks are arranged in a triangle — row 1 has 1 slot, row 2 has 2 slots, row 3 has 3 slots, and so on. Packages are assigned IDs sequentially and must be allocated slot by slot, row by row:

```
P1
P2 P3
P4 P5 P6
P7 P8 P9 P10
```

No row knows in advance what ID it starts at — it continues from wherever the previous row left off.

### Approach

This problem directly combines two things from the patterns section:

- **Pattern 1** — triangle shape (inner loop runs `0` to `i`)
- **Pattern 4** — continuous state (a variable declared outside both loops that never resets)

The triangle shape is straightforward. The hard part is the sequential IDs. If you declared `id` inside the outer loop, it would reset to 1 at the start of every row — giving you `P1 / P1 P2 / P1 P2 P3`, not what we want. Declaring it outside both loops and only incrementing inside means it flows continuously across all rows, exactly like `ch` did in the character pattern.

```java
public static void wareHouse() {
    int n = 5;
    int id = 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("Pid: " + id + " ");
            id++;
        }
        System.out.println();
    }
}
```

**Key takeaway:** Whenever a value must survive across iterations of the outer loop, it lives outside both loops. This is the same lesson as the character pattern, applied to a logistics simulation. State management in real systems — counters, IDs, running totals — almost always works this way.

---

## Connecting Back to the Patterns

| Real-World Problem    | Pattern It Builds On          | New Concept Added              |
|-----------------------|-------------------------------|--------------------------------|
| Server Load Heatmap   | Star Triangle (2D traversal)  | Conditional printing from data |
| Warehouse Allocation  | Triangle shape + Char Pattern | Persistent state across rows   |

Both problems have the same loop skeleton as the basic patterns. What changes is what happens inside — either a condition or a persisted variable. Once you own the loop structure, real problems are just variations on the inside.

---

## What You Practiced

- Converting raw 2D data into a visual representation
- Using nested loops for grid processing
- Managing continuous state across loop iterations
- Translating a real-world requirement into loop logic

---

## What to Try Next

- **Diagonal traversal** — print only elements where `i == j` (the main diagonal of a grid)
- **Spiral order traversal** — classic interview problem that extends 2D grid thinking
- **Seat booking system** — mark seats as booked/available using a 2D boolean array
- **Inventory restocking** — extend the warehouse problem to track remaining capacity per row