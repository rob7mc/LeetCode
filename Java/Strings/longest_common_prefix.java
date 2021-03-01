/*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
*/

class Solution {
    public String longestCommonPrefix(String[] strs) { // ["hello", "hell"] [0, 1]
        if(strs.length == 0){return "";}
        String p = strs[0]; // hello
        for(int i=1; i<=strs.length-1; i++) { 
            p = prefix(p, strs[i]); // p = prefix(hello, hell) (1)
        } 
        return p; // hell    
    }
    
    static String prefix(String p, String strs) { 
        String answer = "";
        for(int i=0, j=0; i<=p.length()-1 && j<=strs.length()-1; i++, j++) {
            if(p.charAt(i) != strs.charAt(j)) {break;} // "0" != "" (4)
            answer += p.charAt(i); // "h" (0) - "he" (1) - "hel" (2) - "hell" (3)
        } 
        return answer; // hell
    }
}