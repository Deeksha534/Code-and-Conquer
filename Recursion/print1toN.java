/*
Input: n = 5
Output:
1  
2  
3  
4  
5
*/

//--Forward recursion--(leetcode form)
class Solution {

    public void printNumbers(int n) {
        helper(1, n);
    }

    public void helper(int count, int n) {
        if (count > n) {
            return;
        }

        System.out.println(count);
        helper(count + 1, n);
    }
}

//---Normal form---
import java.util.Scanner;

public class dummy {

    public static void printNumbers(int count, int n) {
        if (count > n) {
            return;
        }

        System.out.print(count + " ");
        printNumbers(count + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(1, n);

        sc.close();
    }
}

//Time Complexity: O(N), we print every number from 1 to N using recursion
//Space Complexity: O(N), stack space used for recursive calls.