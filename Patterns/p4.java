/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/

class Solution {
    public void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(N²), because the outer loop runs N times and the inner loop runs up to i times for each row.
//Space Complexity: O(1), since only loop variables are used.