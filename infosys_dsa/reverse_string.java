/*
Input: s = "abdcfe"
Output: "efcdba"
LEETCOE:344
*/

//--Backward traversal--
class Solution {
    public static String reverseString(String s) {
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
        
    }
}

// Time Complexity: O(N²), since each string concatenation creates a new String and copies the existing characters.
// Space Complexity: O(N), as a new reversed string is created.

//--two point approach--
class Solution {
    public String reverseString(String s) {     // the function takes string as input so convert to array

        char[] arr = s.toCharArray(); //if the func takes array then directly do it.

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}

// Time Complexity: O(N), since the string is converted to a character array, reversed using two pointers, and converted back to a string.
// Space Complexity: O(N), as an additional character array of size N is created.

//---Using Stacks---
class Solution {
    public String reverseString(String s) {
     Stack<Character> st=new Stack<>();
     for(int i=0;i<=s.length()-1;i++){
         st.push(s.charAt(i));
    }
    StringBuilder res=new StringBuilder();
    for(int i=0;i<=s.length()-1;i++){
    res.append(st.pop());
    
    }
    return res.toString();
  }
}

// Time Complexity: O(N), since each character is pushed onto the stack once,popped once, and the final String is created in linear time.
// Space Complexity: O(N), as the stack and StringBuilder require additional space proportional to the length of the string.

//--Using inbuilt--
class Solution {
    public String reverseString(String s) {
     StringBuilder res = new StringBuilder(s);
        res.reverse();
      	return res.toString();
  }
}

// Time Complexity: O(N), since the string is copied, reversed, and converted back to a string.
// Space Complexity: O(N), as an extra StringBuilder is used to store the characters.

//--Leetcode solution--
class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}

// Time Complexity: O(N), since each character is swapped at most once while traversing half of the array.
// Space Complexity: O(1), since the reversal is done in-place using only a temporary variable and two pointers.