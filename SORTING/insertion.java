/*Insertion Sort is a simple comparison-based sorting algorithm that builds the sorted array one element at a time. It works by taking each element from the unsorted part of the array and inserting it into its correct position in the already sorted part.
It is similar to the way we sort a deck of playing cards in our hands—pick one card at a time and place it where it belongs among the sorted cards.*/

class Solution {
    public int[] insertionSort(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            int curr=nums[i];
            int j=i-1;

            while(j>=0 && nums[j]>curr){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=curr;
        }
        return nums;
    }
}

/*

 Time Complexity: 

  Best Case    : O(n)    -> Array is already sorted; only one comparison per element. 

  Average Case : O(n²)   -> Elements are shifted to their correct positions. 

  Worst Case   : O(n²)   -> Array is reverse sorted; maximum shifts are required. 

  

  Space Complexity: 

  O(1) -> In-place sorting algorithm; uses only a constant amount of extra memory. 

 */