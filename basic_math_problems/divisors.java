/*
Input: n = 6
Output = [1, 2, 3, 6]
*/

//---Bruteforce---
class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

//Time Complexity: O(N), we check for every number from 1 to N.
//Space Complexity: O(N), extra space used for storing divisors.

//--Optimal--
class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            
            if (n / i != i) {
            list.add(n / i);
            }
            }
        }
        Collections.sort(list);
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

// Time Complexity: O(√n + k log k), where k is the number of divisors.
// Space Complexity: O(k), where k is the number of divisors.

//--without sorting--
import java.util.*;
class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}

// Time Complexity: O(√N), because we iterate only up to the square root of N and find divisor pairs in each iteration.
// Space Complexity: O(k), because we store all k divisors in an ArrayList and the output array.