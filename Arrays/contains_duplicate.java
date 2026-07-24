/*
Input: nums = [1,2,3,1]
Output: true
LEETCODE:217
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

// Time Complexity: O(N²), as two nested loops are used to compare every pair of elements.
// Space Complexity: O(1), since only constant extra space is used.

//--Hashset approach---
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}

// Time Complexity: O(N), as each element is visited once and HashSet operations (contains/add) take O(1) on average.
// Space Complexity: O(N), as the HashSet may store up to N unique elements in the worst case.