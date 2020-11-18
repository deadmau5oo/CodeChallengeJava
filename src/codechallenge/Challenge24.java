/* Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
*/
package codechallenge;

public class Challenge24 {
    public static int trap(int[] height) {
        int leftWall = 0, rightWall = height.length-1,water = 0;
        
        while(leftWall < rightWall){
            int min = Math.min(height[leftWall], height[rightWall]);
            if(height[leftWall] < height[rightWall]){
                leftWall++;
            } else{
                rightWall--;
            }
            while(leftWall < rightWall){
                if(min > height[leftWall]){
                    water += min - height[leftWall++];
                } else if( min > height[rightWall]){
                    water += min - height[rightWall--];
                } else{
                    break;
                }
            }
        }
        return water;
    }
    
    static void run(){
        int[] heightWalls = {4,2,0,3,2,5};
        System.out.println(trap(heightWalls));
    }
}
