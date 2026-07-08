/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

class Solution {
    public void pattern19(int n) {
        int inis=0;         //initial space
       //upperhalf
       for (int i = 0; i < n; i++) {
        //stars
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<inis;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
        inis+=2;
        }

        //lowerhalf
        inis=2*n-2;
        for (int i = 0; i < n; i++) {
        //stars
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<inis;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        inis-=2;
        }


    }
}

//Time Complexity: O(N2), For each of the N rows, we print up to 2N characters (stars and spaces).
//Space Complexity: O(1), No extra space is used apart from loop variables.