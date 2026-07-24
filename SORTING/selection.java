//Selection Sort is a simple comparison-based sorting algorithm that repeatedly finds the smallest element from the unsorted portion of the array and places it at its correct position.
//Real-Life Analogy: Just like arranging exam papers by repeatedly picking the paper with the lowest marks and placing it at the beginning until all papers are sorted.

class Solution {

    public void selectionSort(int[] arr) {

        int n = arr.length;

        // Traverse through the array
        for (int i = 0; i < n - 1; i++) {

            // Assume the current element is the minimum
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

/*
 Selection Sort
 
 Time Complexity:
 Best Case    : O(n²)   -> Scans the remaining array to find the minimum element in every pass.
 Average Case : O(n²)   -> Performs the same number of comparisons regardless of input order.
 Worst Case   : O(n²)   -> Continues scanning the unsorted portion in every pass.
 
 Space Complexity: O(1) -> In-place sorting algorithm; uses only a constant amount of extra memory.
 */