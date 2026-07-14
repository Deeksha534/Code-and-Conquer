/*
Input: n = 25
Output: 52
LEETCODE:7
*/

class Solution {
    public int reverseNumber(int n) {
        int rev=0;
        
        while(n>0){
            int lastno=n%10;
            rev=rev*10+lastno;
            
            n=n/10;
        }
    return rev;
    }
}

//Time Complexity: O(log₁₀N),The number of iterations in the loop depends on the number of digits in the number N. Since each digit is processed once using constant time operations (modulo, division, multiplication, and addition), the total time taken is proportional to the number of digits, which is log₁₀N.
//Space Complexity: O(1),Only a constant number of variables are used regardless of the size of the input number.

//---Leetcode approach----
class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);  
        int rev = 0; 
        while (num != 0) {
            int ld = num % 10;  
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0; 
            }
            rev = rev * 10 + ld;  
            num = num / 10;  
        }
        return (x < 0) ? (-rev) : rev;  
    }
}

// Time Complexity: O(log10(N)), because we process each digit of the number once.
// Space Complexity: O(1), because we use only a few variables and no extra data structure.