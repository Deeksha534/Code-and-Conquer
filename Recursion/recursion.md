# Recursion in Java

## What is Recursion?

**Recursion** is a programming technique in which a method calls itself
to solve a problem by breaking a larger problem into smaller
subproblems. The recursive calls continue until a **base case** is
reached.

------------------------------------------------------------------------


# Components of Recursion

Every recursive function has two parts:

## 1. Base Case

The condition that stops recursion.

``` java
if(n == 0){
    return;
}
```

Without a base case, recursion never stops.

------------------------------------------------------------------------

## 2. Recursive Case

The function calls itself with a smaller input.

``` java
print(n - 1);
```

The input should move towards the base case.

------------------------------------------------------------------------

# General Syntax

``` java
returnType functionName(parameters){

    // Base Case
    if(condition){
        return value;
    }

    // Recursive Case
    return functionName(smallerInput);
}
```

------------------------------------------------------------------------

# Example 1 -- Print 1 to N

``` java
public static void print(int n){
    if(n == 0)
        return;

    print(n - 1);
    System.out.print(n + " ");
}
```

Output

    1 2 3 4 5

------------------------------------------------------------------------

# How Recursion Works

Calling `print(3)`:

    print(3)
    │
    ├── print(2)
    │   ├── print(1)
    │   │   ├── print(0)
    │   │   │
    │   │   └── Base Case
    │   │
    │   └── prints 1
    │
    └── prints 2

    prints 3

Execution Flow

    Calls go DOWN.

    Returns come UP.

------------------------------------------------------------------------

# Call Stack

Every recursive call is stored in memory called the **Call Stack**.

Each stack frame stores: - Parameters - Local Variables - Return Address

Example:

    factorial(4)
    ↓
    factorial(3)
    ↓
    factorial(2)
    ↓
    factorial(1)

    Base Case

    factorial(1)
    ↑
    factorial(2)
    ↑
    factorial(3)
    ↑
    factorial(4)

The Call Stack follows **LIFO (Last In First Out)**.

------------------------------------------------------------------------

# Stack Overflow

A **Stack Overflow** occurs when recursion never reaches the base case.

Reasons: - Missing base case - Wrong recursive call - Input is not
reduced

In Java, this throws:

    StackOverflowError

------------------------------------------------------------------------

# Recursive Tree

Example: factorial(4)

    factorial(4)
    │
    └── factorial(3)
        │
        └── factorial(2)
            │
            └── factorial(1)
                │
                └── return 1

    return 2
    return 6
    return 24

------------------------------------------------------------------------

# Time Complexity

Depends on the number of recursive calls.

  Problem              Time Complexity
  -------------------- -----------------
  Print 1 to N         O(n)
  Factorial            O(n)
  Binary Search        O(log n)
  Fibonacci (Simple)   O(2\^n)
  Merge Sort           O(n log n)

------------------------------------------------------------------------

# Space Complexity

Recursion uses the call stack.

  Problem         Space Complexity
  --------------- ------------------
  Print 1 to N    O(n)
  Factorial       O(n)
  Binary Search   O(log n)
  Fibonacci       O(n)

------------------------------------------------------------------------

# Advantages

-   Simple and elegant code
-   Easy for divide-and-conquer algorithms
-   Natural for tree and graph traversal
-   Reduces nested loops in some problems

------------------------------------------------------------------------

# Disadvantages

-   Extra memory due to call stack
-   Risk of StackOverflowError
-   Function call overhead
-   Sometimes slower than iteration

------------------------------------------------------------------------

# Applications

-   Factorial
-   Fibonacci
-   Binary Search
-   Merge Sort
-   Quick Sort
-   Tree Traversals
-   DFS
-   Backtracking
-   Dynamic Programming
-   Maze Problems

------------------------------------------------------------------------

# Common Mistakes

1.  Forgetting the base case.
2.  Recursive call does not reduce the input.
3.  Infinite recursion.
4.  Wrong return statement.
5.  Ignoring time and space complexity.

------------------------------------------------------------------------

# Interview Tips

-   Always write the base case first.
-   Explain how the input becomes smaller.
-   Mention time and space complexity.
-   Dry-run using a small example.
-   Know when iteration is more efficient.

------------------------------------------------------------------------

# Practice Questions

## Easy

1.  Print numbers from 1 to N.
2.  Print numbers from N to 1.
3.  Print even numbers recursively.
4.  Print odd numbers recursively.
5.  Factorial.
6.  Fibonacci Number.
7.  Sum of first N natural numbers.
8.  Sum of digits.
9.  Count digits.
10. Reverse a string.
11. Check palindrome.
12. Reverse an array.
13. Find maximum in an array.
14. Find minimum in an array.
15. Check if an array is sorted.

## Intermediate

16. Power (x\^n).
17. Binary Search.
18. GCD using Euclid's Algorithm.
19. Decimal to Binary.
20. Remove duplicate characters.
21. Count occurrences of a character.
22. Print all subsequences.
23. Generate all subsets.
24. Generate all combinations.
25. Josephus Problem.

## Advanced

26. Generate all permutations.
27. Combination Sum.
28. N-Queens.
29. Sudoku Solver.
30. Rat in a Maze.
31. Word Search.
32. Tower of Hanoi.
33. Palindrome Partitioning.
34. Letter Combinations of Phone Number.
35. K-th Grammar.

------------------------------------------------------------------------

# Frequently Asked Interview Questions

### Why do we need a base case?

To stop recursion. Without it, recursion continues forever and causes a
StackOverflowError.

### Why is recursion space complexity O(n)?

Because each recursive call occupies one stack frame until it returns.

### When should recursion be preferred?

-   Trees
-   Graphs
-   Divide-and-Conquer
-   Backtracking

### Is recursion always better than loops?

No. Iteration is often more memory-efficient, while recursion can make
some algorithms much simpler to express.

------------------------------------------------------------------------

# Summary

-   Recursion is a function calling itself.
-   Every recursive function must have a base case.
-   Calls are stored in the call stack.
-   Missing a base case leads to StackOverflowError.
-   Time and space complexity depend on the number of recursive calls.
-   Master easy problems before moving to backtracking and dynamic
    programming.
