/* Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
*/
package codechallenge;

import java.util.Arrays;

public class Challenge39 {
    
    public static int[] runningSum(int[] nums) {
        nums = runningSum(nums, 1, nums[0]);
        return nums;
    }
    
    public static int[] runningSum(int[] nums, int counter, int plusBefore) {
        plusBefore += nums[counter];
        nums[counter] = plusBefore;
        if (counter == nums.length-1) {
            return nums;
        }
        return runningSum(nums, counter+1, plusBefore);
    }
    
    static void run(){
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
