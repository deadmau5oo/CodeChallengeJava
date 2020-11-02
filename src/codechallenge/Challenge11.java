/* Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
Follow up: The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Example 3:
Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000

Example 4:
Input: nums1 = [], nums2 = [1]
Output: 1.00000

Example 5:
Input: nums1 = [2], nums2 = []
Output: 2.00000
*/
package codechallenge;

public class Challenge11 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int counter1 = 0, counter2 = 0, position = 0;
        int[] ans = new int[nums1.length+nums2.length];
        while (counter1<nums1.length && counter2<nums2.length) {
            if (nums1[counter1]<=nums2[counter2]) {
                ans[position]=nums1[counter1];
                counter1++;
                position++;
            }
            else{
                if (nums2[counter2]<=nums1[counter1]) {
                ans[position]=nums2[counter2];
                counter2++;
                position++;
                }
            }
        }
        while (position<ans.length) { 
            if (counter1<nums1.length) {
                ans[position]=nums1[counter1];
                counter1++;
                position++;
            }
            if (counter2<nums2.length) {
                ans[position]=nums2[counter2];
                counter2++;
                position++;
            }
        }
        
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        
        if(ans.length%2==0){
            return (double)(ans[ans.length/2]+ans[ans.length/2-1])/2;
        }
        else{
            return ans[ans.length/2];
        }
    }
        
    public static void run(){
        int[]A={1,2,5,7};
        int[]B={3,4,8,10};
        System.out.println(findMedianSortedArrays(A, B));
    }
}
