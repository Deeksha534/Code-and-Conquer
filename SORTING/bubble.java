//Bubble Sort is the simplest comparison-based sorting algorithm. It repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest unsorted element "bubbles up" to its correct position at the end of the array. This process continues until the entire array becomes sorted

class Solution {

    public void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/* Time Complexity:
 Best Case: O(N) (with optimization using a swapped flag)
 Average Case: O(N²)
 Worst Case: O(N²)
 */

// Space Complexity: O(1), as sorting is performed in-place using constant extra space.


//Optimized 
class Solution {

    public void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}