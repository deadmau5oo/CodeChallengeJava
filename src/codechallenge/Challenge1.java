/* Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
package codechallenge;

import java.util.Arrays;

public class Challenge1 {
    
    public static int[] twosum(int[] arrayNum,int target){//Principal Code Solution
        int [] result={0,0};
        
        for (int i = 0; i < arrayNum.length; i++) {
                    result[0]=i;
            for (int j = i+1; j < arrayNum.length; j++) {
                    result[1]=j;
                if (arrayNum[i]+arrayNum[j]==target) {
                    return result;
                }
            }
        }
        return result;
}
    public int[] twosumRecursivity(int[] arrayNum,int target){//not for loong arrays
        int [] result={0,1};
        result=twosumRecursivity(arrayNum,target,result);
        return result;
}
    public int[] twosumRecursivity(int[] arrayNum,int target,int [] result){
        if(arrayNum[result[0]]+arrayNum[result[1]]==target){
            return result;
        }
        else{
            if (result[1]==arrayNum.length-1) {
                result[0]++;
                result[1]=result[0]+1;
                twosumRecursivity(arrayNum,target,result);
            }
            else{
                result[1]++;
                twosumRecursivity(arrayNum,target,result);
            }
        }
        return result;
    }
    
    static void run(){
        int [] arrayNum = {11,2,15,7};
        int target = 9;
        
        
        System.out.println(Arrays.toString(twosum(arrayNum,target)));
    }
    
}

/* {11,2,15,7}9 {3,2,4,7,2,2,6}8 {0,4,3,0}0 {-3,4,3,90}0 */