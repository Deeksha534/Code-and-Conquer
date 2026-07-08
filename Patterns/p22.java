/*
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/

class Solution {
    public void pattern22(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

               System.out.print(n - min);                  // or just System.out.print(n - min + " ");

                // Print space only between numbers
                if (j != 2 * n - 2) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

//Time Complexity: O((2N-1)²) ≈ O(N²), since we print every cell once.
//Space Complexity: O(1), only variables for indices are used.