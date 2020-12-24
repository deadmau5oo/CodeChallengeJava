/* Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Example 2:
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
*/
package codechallenge;

import java.util.Arrays;

public class Challenge50 {
    public static int findNumbers(int[] nums) {
        if(nums.length==0) return 0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]>=10&&nums[i]<=99)||(nums[i]>=1000&&nums[i]<=9999)||(nums[i]>=100000&&nums[i]<=999999)) count++;
        }
        return count;
    }
    
    static void run(){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
