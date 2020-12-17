/* Shuffle String

Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.

Example 1:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.

Example 2:
Input: s = "aiohn", indices = [3,1,4,2,0]
Output: "nihao"

Example 3:
Input: s = "aaiougrt", indices = [4,0,2,6,7,3,1,5]
Output: "arigatou"

Example 4:
Input: s = "art", indices = [1,0,2]
Output: "rat"
*/
package codechallenge;

public class Challenge45 {
    
    public static String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        
        return new String(ans);
    }
    
    static void run(){
        String s = "aaiougrt";
        int[] indices = {4,0,2,6,7,3,1,5};
        System.out.println(restoreString(s, indices));
    }
}
