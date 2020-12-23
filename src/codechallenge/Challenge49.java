/* Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Follow up:

Could you solve this problem without using the library's sort function?
Could you come up with a one-pass algorithm using only O(1) constant space?
 
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

Example 3:
Input: nums = [0]
Output: [0]

Example 4:
Input: nums = [1]
Output: [1]
*/
package codechallenge;

import java.util.Arrays;

public class Challenge49 {
    public static void sortColors(int[] nums) {
        sortColors(nums, 0, 0, nums.length - 1);
    }
    
    public static void sortColors(int[] nums, int start, int mid, int end) {
        if(mid > end)
            return;
        if(nums[mid] == 0) {
            int temp = nums[start];
            nums[start] = nums[mid];
            nums[mid] = temp;
            sortColors(nums, start + 1, mid + 1, end);
        } else if(nums[mid] == 1) {
            sortColors(nums, start, mid + 1, end);
        } else {
            int temp = nums[mid];
            nums[mid] = nums[end];
            nums[end] = temp;
            sortColors(nums, start, mid, end - 1);
        }
    }
    
    static void run(){
        int[] nums = {1,2,0,2,1,1,0,2,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
