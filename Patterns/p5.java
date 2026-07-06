/*
*****
****
***
**
*
*/

class Solution {
    public void pattern5(int n) {
        for(int i=1;i<=n;i++){                       // for(int i = 0; i < n; i++) 
            for(int j=0;j<n-i+1;j++){                //for(int j = 0; j < n - i; j++)
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//Time Complexity: O(N²), because the outer loop runs N times and the inner loop runs up to i times for each row.
//Space Complexity: O(1), since only loop variables are used.