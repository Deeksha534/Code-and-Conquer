/*Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
Example 1
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
TWO POINT APPROACH*/

class Solution {
    public void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
   
    }
}

// Arrays are objects in Java. The method receives a copy of the array's reference,
// so both the caller and the method point to the same array. Hence, changes made
// inside the method are reflected in the original array (Java is pass-by-value of the reference).