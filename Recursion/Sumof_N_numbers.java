/*
Input : N = 4
Output : 10
Explanation : first four natural numbers are 1, 2, 3, 4.
Sum is 1 + 2 + 3 + 4 => 10.
*/

//--Bruteforce method--
class Solution {
    public int NnumbersSum(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum;
    }
}

//Time Complexity: O(N),We iterate from 1 to N once, performing a constant-time addition operation in each iteration, resulting in linear time complexity.
//Space Complexity: O(1),We only use a few variables to store the sum and loop counter, so the space usage remains constant regardless of N.

//--Using formula--
class Solution {
    public int NnumbersSum(int N) {
        return (N * (N + 1) / 2);
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)

//--Recursive approach--
class Solution {

    public int NnumbersSum(int N) {

        // Base case
        if (N == 0) {
            return 0;
        }

        // Recursive call
        return N + NnumbersSum(N - 1);
    }
}

//Time Complexity: O(N),The function is called N times, with each call performing O(1) work.
//Space Complexity: O(N),Due to recursive function calls being stored on the call stack, which grows linearly with N.
