/* Subtract the Product and Sum of Digits of an Integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
*/
package codechallenge;

public class Challenge46 {
    
    public static int subtractProductAndSum(int n) {
        int ans = subtractProductAndSum(n+"", 1, 0, 0);
        return ans;
    }
    
    public static int subtractProductAndSum(String n,int pod, int sod, int position) {
        pod *= Character.getNumericValue(n.charAt(position));
        sod += Character.getNumericValue(n.charAt(position));
        if (position == n.length()-1) {
            return pod - sod;
        }
        return subtractProductAndSum(n, pod, sod, position+1);
    }
    
    static void run(){
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }
}
