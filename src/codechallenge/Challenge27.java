/* Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

*/
package codechallenge;

import java.util.Arrays;

public class Challenge27 {
    public static int[] moveZeroes(int[] nums) {
        int numsBeforeAction = nums.length;
        for (int i = 0; i < numsBeforeAction; i++) {
            if (nums[i]==0) {
                nums = toEnd(nums, i);
                numsBeforeAction--;
                i--;
            }
        }
        return nums;
    }
    static int[] toEnd(int[] arrayNums, int position){
        if (position==arrayNums.length-1) {
            return arrayNums;
        }
        else{
            arrayNums[position] = arrayNums[position+1];
            arrayNums[position+1] = 0;
        }
        return toEnd(arrayNums, position+1);
    }
    
    static void run(){
        int[] nums = {0,0,1};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
