/*
A B C D E 
A B C D 
A B C 
A B 
A 
*/

class Solution {
    public void pattern15(int n) {
        for (int i =1; i <=n; i++) {
            for (char ch='A'; ch<='A'+(n-i); ch++) {
                System.out.print(ch);
                }
            System.out.println();
        }


    }
}

//Time Complexity: O(N²), due to the total number of characters printed.
//Space Complexity: O(1), only loop variables are used.