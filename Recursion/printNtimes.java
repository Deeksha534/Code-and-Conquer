/*
Input: N = 3
Output: Ashish Ashish Ashish 
*/

class Solution {

    public void printNTimes(int n) {
        printName(1, n);
    }

    public void printName(int i, int n) {
        // Base case
        if (i > n) {
            return;
        }

        System.out.println("Dee");

        // Recursive call
        printName(i + 1, n);
    }
}

//Time Complexity: O(N), we print our name exactly N times.
//Space Complexity: O(N), stack space used for recursive calls.