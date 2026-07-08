/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/

class Solution {
    public void pattern20(int n) {
        int inis=2*n-2;;         //initial space
       //upperhalf
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
         
        //lowerhalf
        inis=2;
        for (int i = 0; i < n-1; i++) {
        //stars
        for(int j=0;j<n-i-1;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<inis;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=0;j<n-i-1;j++){
            System.out.print("*");
        }
        System.out.println();
        inis+=2;
        }

    }
}

OR

class Solution {
    // Function to print Pattern 20
    public void pattern20(int n) {
        // Initialize spaces between star blocks
        int spaces = 2 * n - 2;

        // Loop for rows
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Calculate stars for first half
            int stars = i;

            // Adjust stars for second half
            if (i > n) stars = 2 * n - i;

            // Print left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();

            // Adjust spaces for next row
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
    }
}

// Time Complexity: O(N²), because nested loops print approximately 2N × 2N characters.
// Space Complexity: O(1), as only loop variables are used.