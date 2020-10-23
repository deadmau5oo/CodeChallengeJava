/* Climbing Stairs Recursive Solution ascendant

You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/

package codechallenge;

public class Challenge4 {
    static int climbStairs(int n) {
        if(n<=3){
            return n;
        }else{
            n=climbStairs(n, 3,2,4);
        }
        
        return n;
    }
    static int climbStairs(int n,int result1,int result2,int number){
        if(number==n){
            return result1+result2;
        }else{
            return climbStairs(n, result1+result2, result1, number+1);
        }
    }
    
    static void run(){
        System.out.println(climbStairs(45));
    }
}
