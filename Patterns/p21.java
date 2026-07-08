/*
*****
*   *
*   *
*   *
*****
*/

class Solution {
    public void pattern21(int n) {
         for (int i = 0; i < n; i++) {
        for(int j=0;j<n;j++){
            if(i==0||j==0||i==n-1||j==n-1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }

    }
}

//Time Complexity: O(N2), For each of the n rows, we print n characters.
//Space Complexity: O(1), Only loop counters are used.