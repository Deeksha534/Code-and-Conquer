/*
*
**
***
****
*****
****
***
**
*
*/

class Solution {
    public void pattern10(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n-1; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
   }
}

// Time Complexity: O(N²), because the two nested loop sections together print a total of 1 + 2 + ... + N + (N-1) + ... + 1 = N² characters.
// Space Complexity: O(1), as we use only loop variables and no extra data structures.