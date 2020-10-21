/* Top K Frequent Elements
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
You can return the answer in any order.
*/
package codechallenge;

import java.util.Arrays;

public class Challenge2 {
    
    public static int[] topKFrequent(int[] nums, int k) {
        int answer[] = new int[k];
        int max=0,countMax=0,number,countNumber=0;
        boolean noRepeat=true,ceroIn=false;
        
        for (int i = 0; i <= k-1; i++) {

            for (int j = 0; j <= nums.length-1; j++) {
                for(int e =0;e<=k-1;e++){
                    if(nums[j]==answer[e]){
                        noRepeat=false;
                    }
                    if (nums[j]==0&&ceroIn==false) {
                        noRepeat=true;
                    }
                }
                if (noRepeat) {
                    countNumber=0;
                    number=nums[j];
                    if (number!=max) {
                        for (int l = 0; l <= nums.length-1; l++) {
                            if (nums[l]==number) {
                                countNumber++;
                            }
                        }
                    }
                    if(countNumber>countMax){

                        countMax=countNumber;
                        max=number;
                        countNumber=0;
                    }
                }else{noRepeat=true;}
            }
            noRepeat=true;
            answer[i]=max;
            countMax=0;
            if (max==0) {
                ceroIn=true;
            }
        }
        return answer;
    }
    
    
    static void run(){
        int[] arrayNum = {2,0,-1,0,-1,2,3,3};
        System.out.println(Arrays.toString(topKFrequent(arrayNum, 2)));
    }
    
}
