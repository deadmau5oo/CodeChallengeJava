/* Plus One Recursive
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Example 3:
Input: digits = [0]
Output: [1]
*/
package codechallenge;

import java.util.Arrays;

public class Challenge3 {
    static int[] plusOne(int[] digits) {
        digits=plusOne(digits,digits.length-1);
        return digits;
    }
    
    static int[] plusOne(int[] digits,int counter) {
        if(digits[counter]<9){
            digits[counter]+=1;
            return digits;
        }
        if(counter==0){
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;
        }
        else{
            digits[counter]=0;
            digits=plusOne(digits,counter-1);
        }
        return digits;
    }
    
    static void run(){
        int[] arrayNum = {9,9};
        System.out.println(Arrays.toString(plusOne(arrayNum)));
    }
}
