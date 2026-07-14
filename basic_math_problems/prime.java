/*
Input: n = 5
Output: true
*/

//--Bruteforce--
class Solution {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// Time Complexity: O(N), because we check divisibility for every number from 2 to N - 1.
// Space Complexity: O(1), because we use only a constant amount of extra space.


//--optimal--
class Solution {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// Time Complexity: O(√N), because we check divisibility only up to the square root of N.
// Space Complexity: O(1), because we use only a constant amount of extra space.