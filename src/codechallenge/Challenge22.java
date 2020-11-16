/* Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
*/
package codechallenge;

import java.util.Arrays;

public class Challenge22 {
    public static int[] searchRange(int[] nums, int target) {
        int[] rangeOfNum = {-1,-1};
        if (nums.length==0) {
            return rangeOfNum;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (rangeOfNum[0] != -1) {
                    rangeOfNum[1]=i;
                }
                else {
                    rangeOfNum[0]=i;
                    rangeOfNum[1]=i;
                }
            }
        }
        return rangeOfNum;
    }

    static void run(){
        int[] nums = {5,7,7,8,8,8,10,12};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
}
