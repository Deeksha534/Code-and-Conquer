GEEKSFORGEEKS SHEET
/*
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
*/

//---Iterative---(Best one)
class Solution {
    public boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
            return  false;
            }
        }
        return true;
    }
}

// Time Complexity:
// Best Case: O(1), if the array is found unsorted in the first comparison.
// Worst Case: O(N), if the entire array is sorted and all adjacent elements are checked.
// Space Complexity: O(1), as no additional space is used apart from the loop variable.

//---Recursive---
class Solution {
    public boolean isSorted(int[] arr) {
        return helper(arr,0);
    }
    private boolean helper(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return helper(arr,index+1);
    }
}

// Time Complexity: O(N), since each adjacent pair is checked exactly once.
// Space Complexity: O(N), due to the recursion call stack.

//---Builtin method---
class Solution {
    public boolean isSorted(int[] arr) {
        int[] copy = arr.clone();

        Arrays.sort(copy);

        return Arrays.equals(arr, copy);
    }
}

// Time Complexity: O(N log N), since Arrays.sort() takes O(N log N).
// Space Complexity: O(N), as an extra copy of the array is created.