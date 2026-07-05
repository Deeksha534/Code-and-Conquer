/*Given two integers low and high, return the sum of all integers from low to high inclusive.
Example 1
Input: low = 1, high = 5
Output: 15
Explanation: 1 + 2 + 3 + 4 + 5 = 15*/

class Solution {
    public int forLoop(int low, int high) {
       int count=0;
       for(int i=low;i<=high;i++){
         count+=i;
       }
       return count; 
    }
}

// Time Complexity = O(n)