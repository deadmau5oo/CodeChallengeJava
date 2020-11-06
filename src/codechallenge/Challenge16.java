/* Arranging Coins

You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
Given n, find the total number of full staircase rows that can be formed.
n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:
n = 5
The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.

Example 2:
n = 8
The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
*/
package codechallenge;


public class Challenge16 {
    public static int arrangeCoins(int n) {
        return arrangeCoins(n, 1);
    }
    
    public static int arrangeCoins(int n, int rest) {
        if (n-rest<0) {
            return rest-1;
        }
        n-=rest;
        return arrangeCoins(n, rest+1);
    }
    
    static  void run(){
        System.out.println(arrangeCoins(6));
    }
}
