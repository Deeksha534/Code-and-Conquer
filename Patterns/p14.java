/*
A 
A B 
A B C 
A B C D 
*/

class Solution {
    public void pattern14(int n) {
        for (int i =0; i <n; i++) {                           //char ch = 'A';
            for (char ch='A'; ch<='A'+i; ch++) {              //for (int j = 0; j <= i; j++) {     
                System.out.print(ch+" ");                     //System.out.print(ch);
                }                                             //ch++;
            System.out.println();
        }

    }
}

//Time Complexity: O(N²), as the total number of characters printed is 1 + 2 + ... + N = O(N²).
//Space Complexity: O(1), only loop variables are used.