/*
Count all Digits of a Number
1.
Input: n = 4
Output: 1

2.
Input: n = 14
Output: 2
*/

//---Bruteforce---
class Solution {
    public int countDigit(int n) {
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
    return count;
    }
}

/*Time Complexity: O(log10N + 1), where N is the input number. The time complexity is determined by the number of digits in the input integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10N + 1.
In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
In each iteration of the while loop we perform constant time operations like division and increment the counter.
Space Complexity : O(1), as only a constant amount of additional memory for the counter regardless of size of the input number.*/


//-----Optimal----
class Solution {
    public int countDigit(int n) {
        int cnt=(int)(Math.log10(n)+1);
    return cnt;
    }
}

/*
10^0 → 1 digit
10^1 → 2 digits
10^2 → 3 digits
10^3 → 4 digits

From this, you can always derive:
Digits = Floor(log10(N)) + 1
*/

//Time Complexity: O(1), as simple arithmetic operations in constant time are computed on integers.
//Space Complexity : O(1), as only a constant amount of additional memory for the count variable regardless of size of the input number.

