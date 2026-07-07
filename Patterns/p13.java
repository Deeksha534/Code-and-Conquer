/*
1 
2 3 
4 5 6 
7 8 9 10
*/

class Solution {
    public void pattern13(int n) {
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }

    }
}

//Time Complexity: O(N²), since the total number of printed values across rows is 1 + 2 + ... + N = O(N²)
//Space Complexity: O(1), only a counter variable is used.