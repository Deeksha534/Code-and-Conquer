/*
    *
   ***
  *****
 *******
*********
*/

class Solution {
    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            /*for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}

//Time Complexity: O(N²), since nested loops print about N² characters overall.
//Space Complexity: O(1), as no extra data structures are required.