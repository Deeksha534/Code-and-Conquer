/*
Input: n = 2
Output: 2
Explanation: 2! = 1 * 2 = 2.
*/

/--Iterative approach--
class Solution {
    public int factorial(int n) {
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;

    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)

//--Recursive approach--
class Solution {
    public int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*(factorial(n-1));

    }
}

//Time Complexity: O(N), Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N)
//Space Complexity: O(N), In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space.