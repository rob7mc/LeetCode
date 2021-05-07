// Given two strings s and t , write a function to determine if t is an anagram of s.

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        int[] c = new int[26]; // 0-25 (a-z);
        for(int i=0; i<s.length(); i++){
            c[s.charAt(i) - 'a']++; // The - 'a' is for index purposes (c(3) - a(1) = 2.. 0(a),1(b),2(c))
            c[t.charAt(i) - 'a']--;
        }
        for(int j : c){
            if(j != 0){
                return false;
            }
        }
        return true;
    }
}