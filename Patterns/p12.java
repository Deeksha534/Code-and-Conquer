/*1      1
12    21
123  321
12344321
*/

class Solution {
    public void pattern12(int n) {                           //or we can set  int space=2*(n-1);
        for (int i = 1; i <= n; i++) {

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {       //for (int j = 1; j <=space; j++)      
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();                     //after this line space-=2;
        }

    }
}

//Time Complexity: O(N²), as each row involves printing up to 2N characters.
//Space Complexity: O(1), only a few variables are used for computation.