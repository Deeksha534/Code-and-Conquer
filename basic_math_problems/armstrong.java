/*
Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.

Input: n = 12
Output: false
Explanation: Number of digits : 2.
12 + 22 = 1 + 4 = 5.
*/

class Solution {
    public boolean isArmstrong(int n) {
        int num=n;
        int sum=0;
        int k=Integer.toString(n).length();
        while(n>0){
            int lastno=n%10;
            sum+=Math.pow(lastno,k);
            n=n/10;
        }
        return sum==num;

    }
}

//Time Complexity: O(log10N + 1) where N is the input number. The time complexity is determined by the number of digits in the input integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.
//Space Complexity: O(1) as only a constant amount of additional memory for the reversed number regardless of size of the input number.


