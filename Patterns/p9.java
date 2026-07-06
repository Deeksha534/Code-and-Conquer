/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/

class Solution {
public void pattern9(int n) {
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
        for(int i=0;i<n;i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            /*for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}

//Time Complexity: O(N²), because there are nested loops that print a total of roughly N² characters.
//Space Complexity: O(1), as we use only variables and no extra data structures.