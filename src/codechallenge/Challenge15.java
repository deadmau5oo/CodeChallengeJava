/* Add Digits

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:
Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.

Could you do it without any loop/recursion in O(1) runtime?
*/
package codechallenge;


public class Challenge15 {
    
    public static int addDigits(int num) {
        return num<=9 ? num : num%9 == 0 ? 9 : num%9;
    }
    static void run(){
        System.out.println(addDigits(38));
    }
}
