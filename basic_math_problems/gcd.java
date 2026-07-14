/*
Input: n1 = 4, n2 = 6
Output: 2
*/

//-----BruteForce----
class Solution {
    public int GCD(int n1, int n2) {
        int gcd=1;
        for(int i=1;i<Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;

    }
}

//Time Complexity: O(min(N1, N2)) where N1 and N2 is the input number. The algorithm iterates from 1 to the minimum of N1 and N2 and each iteration checks whether both the numbers are divisible by the current number (constant time operations).
//Space Complexity: O(1)as the space complexity remains constant and independent of the input size. Only a fixed amount of memory is required to store the integer variables.

//-----Better approach---
class Solution {
    public int GCD(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }

        return 1;
    }
}

//Time Complexity: O(min(N1, N2)) where N1 and N2 is the input number. The algorithm iterates from the minimum of N1 and N2 to 1 and each iteration checks whether both the numbers are divisible by the current number (constant time operations).
//Space Complexity: O(1) as the space complexity remains constant and independent of the input size. Only a fixed amount of memory is required to store the integer variables.

//-----optimal approach----
class Solution {
    public int GCD(int a, int b) {
        // Continue until one number becomes 0
        while (a > 0 && b > 0) {

            // If a is greater, replace a with a % b
            if (a > b) {
                a = a % b;
            }
            // Otherwise, replace b with b % a
            else {
                b = b % a;
            }
        }

        // If a becomes 0, b is the GCD
        if (a == 0) {
            return b;
        }

        // Otherwise, a is the GCD
        return a;
    }
}

//Time Complexity: O(log(min(N1, N2))) as the Euclidean algorithm repeatedly replaces the larger number with the remainder of dividing it by the smaller number. This rapidly reduces the problem size, requiring at most a logarithmic number of iterations.
//Space Complexity: O(1) as the space complexity remains constant and independent of the input size. Only a fixed amount of memory is required to store the integer variable
