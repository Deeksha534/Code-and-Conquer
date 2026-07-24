/*
Input: n = 3
Output: 0 1 1
LEETCODE:509
*/

//--Iterative apporach--
class Solution {
    public static int[] fibonacciNumbers(int n) {
        int[] ans = new int[n];
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            ans[i] = a;
            int next=a+b;
            a=b;
            b=next;
        }
        return ans;
    }
}

// Time Complexity: O(N), since the loop runs N times and each Fibonacci number is calculated in constant time.
// Space Complexity: O(N), since an array of size N is created to store the Fibonacci numbers.

//---Standard version---
static int findFibonacci(int n) {

    // base case
    if (n == 0) {
        return 0;
    } 
    else if (n == 1) {
        return 1;
    } 
    else {
        return findFibonacci(n - 2) + findFibonacci(n - 1);
    }
}

// Time Complexity: O(2^N), since each recursive call creates two more calls, leading to repeated calculations.
// Space Complexity: O(N), due to the recursion call stack.

//--Recursive---
class Solution {

    public static int[] fibonacciNumbers(int n) {

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = fibonacci(i);
        }

        return ans;
    }

    private static int fibonacci(int n) {

        // Base case
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// Time Complexity: O(2^N), since each Fibonacci call creates two recursive calls.
// Space Complexity: O(N), due to the recursion call stack.