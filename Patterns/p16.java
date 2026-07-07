/*
A 
B B 
C C C 
D D D D 
E E E E E 
*/

class Solution {
    public void pattern16(int n) {
        for (int i =0; i <n; i++) {
            char ch=(char)('A'+ i);
            for (int j=0;j<=i;j++) {
                System.out.print(ch+" ");
                }
            System.out.println();
        }

    }
}

//Time Complexity: O(N²), because the total number of characters printed is the sum of the first N natural numbers.
//Space Complexity: O(1), only loop variables and a character variable are used.
