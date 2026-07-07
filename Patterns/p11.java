/*
1 
0 1 
1 0 1 
0 1 0 1 
*/

class Solution {
    public void pattern11(int n) {
        for(int i=0;i<n;i++){
            int start;
            if (i%2==0) start=1;     
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start; //toggle beetween 0 n 1
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(N²), due to the nested loop structure where rows grow in length.
//Space Complexity: O(1), constant space is used regardless of input size.