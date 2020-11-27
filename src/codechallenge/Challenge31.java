/* Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.
Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer 
range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Example 4:
Input: x = 0
Output: 0
*/
package codechallenge;

public class Challenge31 {
    public static int reverse(int x) {
        String number = Integer.toString(x);
        String reverseNumber = "";
        for (int i = number.length()-1; i >= 0; i--) {
            if ("-".equals(""+number.charAt(i))) {
                reverseNumber = number.charAt(i)+"" + reverseNumber;
            }
            else{
                reverseNumber += number.charAt(i) + "";
            }
        }
        try {
            return Integer.parseInt(reverseNumber);
        } catch (Exception e) {
            return 0;
        }
    }
    static void run(){
        int number = 1534236469;
        System.out.println(reverse(number));
    }
}
