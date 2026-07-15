/*
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/

//--Two point approach--(inplace)
class Solution {
    public void reverse(int[] arr, int n) {
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

// Time Complexity: O(N), because each element is swapped at most once.
// Space Complexity: O(1), as only a temporary variable is used.

//--Bruteforce approach--
class Solution {
    public int[] reverse(int[] arr, int n) {

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }

        return ans;
    }
}

// Time Complexity: O(n) - Single traversal of the array.
// Space Complexity: O(n) - Extra array of size n is used.

//--Built-in Library Function Approach---(If the input is List<Integer>)
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
        return arr;
    }
}

/*
| `int[]`                                | `List<Integer>`                 |
| -------------------------------------- | ------------------------------- |
| Primitive array                        | Java Collection                 |
| Stores `int` values                    | Stores `Integer` objects        |
| Length using `arr.length`              | Size using `arr.size()`         |
| Access using `arr[i]`                  | Access using `arr.get(i)`       |
| Modify using `arr[i] = x`              | Modify using `arr.set(i, x)`    |
| ❌ `Collections.reverse()` doesn't work | ✅ `Collections.reverse()` works |
