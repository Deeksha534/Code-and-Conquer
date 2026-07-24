/*
Input: nums = [3,0,1]
Output: 2
LEETCODE:368
*/

//---Bruteforce approach---
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {

            boolean found = false;

            for (int j = 0; j < n; j++) {

                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1;
    }
}
    
//---Hashset approach---
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<=nums.length;i++){
        if(!set.contains(i)){
            return i;
        }
    
    }
    return -1;
}
}
    
// Time Complexity: O(N), as the array is traversed once to build the HashSet and once to find the missing number.
// Space Complexity: O(N), as the HashSet stores up to N elements.

//---Using sum formula---
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

// Time Complexity: O(N), as the array is traversed once.
// Space Complexity: O(1), as only a few variables are used.

//---XOR approach--
class Solution {
    public int missingNumber(int[] nums) {

        int xor = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor = xor ^ i;
            xor = xor ^ nums[i];
        }

        xor = xor ^ n;

        return xor;
    }
}

// Time Complexity: O(N), as the array is traversed once.
// Space Complexity: O(1), as only one extra variable is used.

