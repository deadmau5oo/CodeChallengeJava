/* Number of Good Pairs

Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:
Input: nums = [1,2,3]
Output: 0
*/
package codechallenge;

public class Challenge42 {
    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            pairs = numIdenticalPairs(nums, nums[i], pairs, i+1);
        }
        return pairs;
    }
    
    public static int numIdenticalPairs(int[] nums, int num, int pairs, int position) {
        if (position > nums.length-1) {
            return pairs;
        }
        if (nums[position] == num) {
            pairs++;
        }
        return numIdenticalPairs(nums, num, pairs, position+1);
    }
    
    static void run(){
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
