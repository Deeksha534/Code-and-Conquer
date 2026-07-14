/*
Input: n = 121
Output: true
LEETCODE:9
*/

class Solution {
    public boolean isPalindrome(int n) {
        int rev=0;
        int palin=n;
        while(n>0){
            int lastno=n%10;
            rev=rev*10+lastno;
            n=n/10;
        }
        return palin==rev;
            
    }
}

//Time Complexity: O(log10N + 1), as in the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1. In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations. In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.
//Space Complexity: O(1), as only a constant amount of additional memory for the reversed number regardless of size of the input number.

//--Leetcode--
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;   //-ve numbers are never palin
        }
        int palin=x;  
        int rev = 0; 
        while (x != 0) {
            int ld = x % 10;  
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return false; 
            }
            rev = rev * 10 + ld;  
            x = x/ 10;  
        } 
        return rev==palin;
    }
}

// Time Complexity: O(log10(N)), because we process each digit of the number once.
// Space Complexity: O(1), because we use only constant extra variables.