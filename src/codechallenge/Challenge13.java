/* First Unique Character in a String

Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

*/
package codechallenge;

import java.util.HashMap;

public class Challenge13 {
    public static int firstUniqChar(String s) {
        if (s.length()==1) {
            return 0;
        }
        if ("".equals(s)) {
            return -1;
        }
        return firstUniqChar( s, 0);
    }
    public static int firstUniqChar(String s, int counter ) {
        HashMap<Character,Integer> inArray = new HashMap<>();
        
        for (counter = 0; counter < s.length(); counter++) {
            if(inArray.containsKey(s.charAt(counter))){
                inArray.put(s.charAt(counter), inArray.get(s.charAt(counter))+1);
            }
            else {
                inArray.put(s.charAt(counter), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (inArray.get(s.charAt(i))==1) {
                return i;
            }
        }
        
        return -1;
    }
    
    static void run(){
        String string = "aabbcc";
        System.out.println(firstUniqChar(string));
    }
    
}
