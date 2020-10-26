/* Consecutive Characters
Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.
Return the power of the string.

Example 1:
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

Example 3:
Input: s = "triplepillooooow"
Output: 5

Example 4:
Input: s = "hooraaaaaaaaaaay"
Output: 11

Example 5:
Input: s = "tourist"
Output: 1
*/
package codechallenge;

import java.util.Arrays;

public class Challenge6 {
    
    static int maxPower(String s) {
        int result=1;
        result=maxPower(s, result, 1,0);
        return result;
    }
    static int maxPower(String s,int result,int counterResult,int counterS) {
        result = counterResult > result ? counterResult : result;
        if (counterS==s.length()-1) {
            return result;
        }
        counterResult = s.charAt(counterS)==s.charAt(counterS+1) ? counterResult+1 : 1;
        result= maxPower(s, result, counterResult, counterS+1);
        return result;
    }
    
    static void run(){
        String s = "leetcode";
        System.out.println(maxPower(s));
    }
}
