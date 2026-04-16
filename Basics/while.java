/*Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
A number ends with digit d if its last digit is d.
Example 1
Input: d = 1
Output: 12300
Explanation:
The first 50 positive integers ending with 1 are: 1, 11, 21, 31, ..., 491
Their sum is 12300.*/

class Solution {
    public int whileLoop(int d) {
        int count = 0;
        int num = d;
        int terms = 0;

        if (d == 0) {
            num = 10; 
        }

        while (terms < 50) {
            count += num;
            num += 10;
            terms++;
        }

        return count;
    }
}