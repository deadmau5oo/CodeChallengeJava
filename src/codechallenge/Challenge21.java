/* Asteroid Collision
We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents 
its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will 
explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:
Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.

Example 2:
Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.

Example 3:
Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

Example 4:
Input: asteroids = [-2,-1,1,2]
Output: [-2,-1,1,2]
Explanation: The -2 and -1 are moving left, while the 1 and 2 are moving right. Asteroids 
moving the same direction never meet, so no asteroids will meet each other.
*/
package codechallenge;

import java.util.Arrays;

public class Challenge21 {
    public static int[] asteroidCollision(int[] asteroids) {
        int asteroidsResultLength = 0;
        for (int i = 0; i < asteroids.length; i++) {
            if(asteroids[i] < 0){
                asteroids=asteroidCollisionReverse(asteroids,i);
            }
        }
        for (int asteroid : asteroids) {
            asteroidsResultLength = asteroid != 0 ? asteroidsResultLength+1 : asteroidsResultLength;
        }
        int[] asteroidsAfterCollision = new int[asteroidsResultLength];
        int counter = 0;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i]!=0) {
                asteroidsAfterCollision[counter]=asteroids[i];
                counter++;
            }
        }
        return asteroidsAfterCollision;
    }
    public static int[] asteroidCollisionReverse(int [] asteroids, int position){
        while (position >= 1) {
            if (asteroids[position-1]<0) {
                break;
            }
            if (asteroids[position] + asteroids[position-1] == 0) {
                    asteroids[position]=0; asteroids[position-1]=0;
                    return asteroids;
            }
            if (asteroids[position] + asteroids[position-1] < 0) {
                asteroids[position-1] = asteroids[position];
                asteroids[position] = 0;
            }
            else{
                asteroids[position] = 0;
                return asteroids;
            }
            position--;
        }
        return asteroids;
    }
    
    static void run(){
        int[] asteroids = {-5,5,10,-5,-4,-11,2};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
