class Solution {
    public int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n*(factorial(n-1));

    }
}

public class dummy {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        System.out.println(sol.factorial(n));
    }
}
