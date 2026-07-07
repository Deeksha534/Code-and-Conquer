/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/

class Solution {
    public void pattern17(int n) {
        for (int i =0; i <n; i++) {

        //space 
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //char
        char ch='A';
        int breakpoint=(2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            System.out.print(ch);

            if (j <= breakpoint) ch++;
                else ch--;
            } 
            //for (int j = 0; j < n - i - 1; j++) {
                //System.out.print(" ");
            //}
            System.out.println();
        }
    }
}


OR

        for (int i = 0; i < n; i++) {

            // Leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Increasing letters
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Decreasing letters
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }


//Time Complexity: O(N²), because for each of the N rows, up to 2N characters (spaces and letters) may be printed, resulting in O(N²) total operations.
//Space Complexity: O(1), as only a constant amount of extra space is used for variables like ch and breakpoint.
