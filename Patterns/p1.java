/*
*****
*****
*****
*/
//any value for n

class Solution {
    public void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

//Time Complexity: O(N²), since we print N stars for each of the N rows.
//Space Complexity: O(1), no additional space is used apart from loop variables.