# Backtracking & Dynamic Programming (DP) - Interview Notes

# 1. Backtracking

## What is Backtracking?

Backtracking is a recursive algorithmic technique that tries every
possible solution. If a choice does not lead to a valid solution, it
undoes that choice (backtracks) and tries another.

### Pattern

``` java
void solve(state){
    if(baseCase){
        // process answer
        return;
    }

    for(each choice){
        makeChoice();
        solve(nextState);
        undoChoice(); // backtrack
    }
}
```

### When to Use

-   Find all possible solutions
-   Generate combinations/permutations
-   Constraint satisfaction problems

### Common Problems

-   Subsets
-   Permutations
-   Combination Sum
-   N-Queens
-   Sudoku Solver
-   Rat in a Maze
-   Word Search

### Complexity

Usually exponential: - O(2\^n) - O(n!)

------------------------------------------------------------------------

# 2. Dynamic Programming (DP)

## What is DP?

Dynamic Programming solves problems by storing answers to overlapping
subproblems so they are computed only once.

### DP Conditions

1.  Overlapping Subproblems
2.  Optimal Substructure

### DP Approaches

#### Memoization (Top-Down)

``` java
int solve(int n){
    if(baseCase) return ans;

    if(dp[n] != -1)
        return dp[n];

    return dp[n] = solve(...);
}
```

#### Tabulation (Bottom-Up)

``` java
dp[0] = base;

for(int i=1;i<=n;i++){
    dp[i] = ...
}
```

### Common Problems

-   Fibonacci
-   Climbing Stairs
-   House Robber
-   Coin Change
-   0/1 Knapsack
-   Longest Common Subsequence
-   Longest Increasing Subsequence
-   Edit Distance

### Complexity

Often improves from exponential to polynomial.

------------------------------------------------------------------------

# Backtracking vs DP

  Backtracking                 Dynamic Programming
  ---------------------------- ---------------------------
  Explores all possibilities   Reuses previous results
  Doesn't store states         Stores states
  Search/Generation            Optimization/Counting
  Mostly recursion             Memoization or Tabulation
  Usually exponential          Often polynomial

------------------------------------------------------------------------

# Interview Questions

## Backtracking

1.  What is backtracking?
2.  How is backtracking different from recursion?
3.  Why do we undo a choice?
4.  When should backtracking be used?
5.  Difference between DFS and backtracking?
6.  Explain N-Queens approach.
7.  How do you optimize backtracking?
8.  Why is the time complexity usually exponential?
9.  Explain Combination Sum.
10. How would you solve Sudoku?

## Dynamic Programming

1.  What is Dynamic Programming?
2.  What are overlapping subproblems?
3.  What is optimal substructure?
4.  Memoization vs Tabulation?
5.  When should DP be preferred over recursion?
6.  How do you identify a DP problem?
7.  Explain space optimization in DP.
8.  Difference between Greedy and DP?
9.  Explain 0/1 Knapsack.
10. Explain Longest Common Subsequence.

------------------------------------------------------------------------

# How to Identify

## Use Backtracking if:

-   Find all solutions
-   Generate all combinations
-   Search with constraints

## Use DP if:

-   Maximum/Minimum
-   Count ways
-   Same subproblem repeats

------------------------------------------------------------------------

# Learning Order

1.  Recursion
2.  Backtracking
    -   Subsets
    -   Permutations
    -   Combination Sum
    -   N-Queens
3.  DP
    -   Fibonacci
    -   Climbing Stairs
    -   House Robber
    -   Coin Change
    -   LCS
    -   Knapsack
