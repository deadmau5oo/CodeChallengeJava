/*  Jewels and Stones

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
*/
package codechallenge;

public class Challenge48 {
    
    public static int numJewelsInStones(String J, String S) {
        if(J.length()==0 || S.length()==0) // Checking if the input is not empty
            return 0;
        
        char chars1[]= J.toCharArray();
        char chars2[]= S.toCharArray();
        int count=0;
        
        for(int i=0;i<chars1.length;i++){
            for(int j=0;j<chars2.length;j++){
                if(chars2[j]==chars1[i]){
                    count++;
                }
            }
        }
        return count;
    }
    
    static void run(){
        String J="aA";
        String S="aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }
    
}
