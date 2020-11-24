/* Reverse String (without burble method)
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.

Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


*/
package codechallenge;

import java.util.Arrays;

public class Challenge28 {
    
    public static void reverseString(char[] s) {
        int counterLeft = 0, counterRight = s.length-1;
        while (counterLeft<counterRight) {            
            s[counterLeft] = (char) (s[counterLeft] * s[counterRight]);
            s[counterRight] = (char) (s[counterLeft] / s[counterRight]);
            s[counterLeft] = (char) (s[counterLeft] / s[counterRight]);
            counterLeft++; counterRight--;
        }
        System.out.println(Arrays.toString(s));
    }
    
    static void run(){
        char[] stringNormal = {'H','a','n','n','a','h'};
        reverseString(stringNormal);
    }
}
