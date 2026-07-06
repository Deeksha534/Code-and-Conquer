/*
*********
 *******
  *****
   ***
    *
*/

class Solution {
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {     //2*n-(2*i+1)
                System.out.print("*");
            }
            /*for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}

//Time Complexity: O(N²), since nested loops print approximately N² characters overall.
//Space Complexity: O(1), as no extra data structures are required.