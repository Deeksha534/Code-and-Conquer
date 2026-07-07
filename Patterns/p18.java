/*
D 
C D 
B C D 
A B C D 
*/

class Solution {
    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {

            // Print characters
            for (int j = n - i - 1; j < n; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }

    }
}

OR

class Solution {
    public void pattern18(int n) {

        for (int i = 0; i < n; i++) {

            // Starting and ending characters
            char start = (char) ('A' + n - i - 1);
            char end = (char) ('A' + n - 1);

            // Print characters from start to end
            for (char ch = start; ch <= end; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}

//Time Complexity: O(N2), as We print roughly N*(N+1)/2 characters.
//Space Complexity: O(1), as No extra space used apart from variables for iteration.