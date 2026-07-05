/*
*
**
***
****
*****
*/
class Solution {
    public void pattern2(int n) {
        for(int i=0;i<n;i++){
          for(int j=0;j<=i;j++){
            System.out.print("*");
          }
        System.out.println();
       }
    }
}

//Time Complexity: O(N2), Outer loop runs N times, and inner loop runs up to N stars cumulatively.
//Space Complexity: O(1), No extra space is used apart from loop counters.