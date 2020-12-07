/* Increasing Triplet Subsequence

Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
Formally the function should:

Return true if there exists i, j, k
such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
Note: Your algorithm should run in O(n) time complexity and O(1) space complexity.

Example 1:
Input: [1,2,3,4,5]
Output: true

Example 2:
Input: [5,4,3,2,1]
Output: false
*/
package codechallenge;

public class Challenge37 {
    public static boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3)
            return false;
        
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n < i) i = n;
            else if(n > i && n < j) j = n;
            else if(n > j) return true;
        }
        
        return false;
    }
    
    static void run(){
        int[] nums = {22,2,3,4,56};
        System.out.println(increasingTriplet(nums));
    }
}
