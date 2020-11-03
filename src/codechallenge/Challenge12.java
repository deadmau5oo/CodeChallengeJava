/* Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [0]
Output: 0

Example 4:
Input: nums = [-1]
Output: -1

Example 5:
Input: nums = [-2147483647]
Output: -2147483647
*/
package codechallenge;

public class Challenge12 {
    
    public static int maxSubArray(int[] nums) {
        return maxSubArray(nums, Integer.MIN_VALUE, 0, 0);
    }
    
    public static int maxSubArray(int[] nums,int ans, int sum, int counter){
        if (counter==nums.length) {
            return ans;
        }
        if (sum < 0) {
            sum=0;
        }
        sum += nums[counter];
        if (sum > ans) {
            ans = sum;
        }
        return maxSubArray(nums, ans, sum, counter+1);
    }
    
    static void run(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    
}
