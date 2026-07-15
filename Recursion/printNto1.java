/*
Input: 5
Output:
5
4
3
2
1
*/

class Solution {
    public void printNumbers(int n) {
        helper(1,n);
    }
    public void helper(int count,int n){
        if(count>n){
            return;
        }
        helper(count+1,n);
        System.out.println(count);
    }
}

//Time Complexity: O(N), we print every number from N to 1 using recursion
//Space Complexity: O(N), stack space used for recursive calls.