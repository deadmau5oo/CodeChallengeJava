/* Largest Rectangle in Histogram
Given n non-negative integers representing the histogram's bar height where the 
width of each bar is 1, find the area of largest rectangle in the histogram.

Example:
Input: [2,1,5,6,2,3]
Output: 10

*/
package codechallenge;

public class Challenge26 {
    public static int largestRectangleArea(int[] heights) {
        int largestWall = 0, temp = 0, counter = 0;
        for (int i = 0; i < heights.length; i++) {
            counter = i-1;
            temp = heights[i];
            while (counter >= 0) {         
                if (heights[counter] >= heights[i]) {
                    temp += heights[i];
                    counter--;
                }
                else{break;}
            }
            counter = i+1;
            while (counter < heights.length) {    
                if (heights[counter] >= heights[i]) {
                    temp += heights[i];
                    counter++;
                }
                else{break;}
            }
            largestWall = Math.max(largestWall, temp);
        }
        return largestWall;
    }
    
    static void run(){
        int [] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
