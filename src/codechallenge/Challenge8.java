/* Longest Substring Without Repeating Characters.  EXTRA: The substring longest
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0
*/
package codechallenge;

public class Challenge8 {
    
    public static int lengthOfLongestSubstring(String s) {
        String subS="";
        String subS2="";
        int counter=0;
        int CounterEnd=0;
        if(s.length()==1){
            return 1;
        }
        if (s.length()==0) {
            return 0;
        }
        while(counter != s.length()-1) {
            if (!subS.contains(s.charAt(CounterEnd)+"")) {
                subS+=""+s.charAt(CounterEnd);
            }
            else{
                if (subS.length()>=subS2.length()) {
                    subS2=subS;
                }
                CounterEnd=counter;
                counter++;
                subS="";
            }
            CounterEnd++;
            if (CounterEnd==s.length()) {
                if (subS.length()>=subS2.length()) {
                    subS2=subS;
                    subS="";
                }
                counter=s.length()-1;
            }
        }
        System.out.println(subS2);
        return subS2.length();
    }
    
    
    static void run(){
        String word = "pwwkew";
        System.out.println(lengthOfLongestSubstring(word));
    }
}
/* anviaj dvdf pwwkew abcabcbb bbbbb asjrgapa jbpnbwwd qrsvbspk tmmzuxt ohvhjdml */