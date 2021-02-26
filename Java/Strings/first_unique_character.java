// Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        char[] c = new char[256]; // Hash Map
        int answer = -1;
        for(int i=0; i<s.length(); i++){
            c[s.charAt(i)]++; // Load up Hash Map with character appearance frequencies from String s
        }
        for(int j=0; j<s.length(); j++){
            if(c[s.charAt(j)] == 1){ // If the character appears once in s
                answer = j; // Then this is the first one so break and return its index
                break;
            }
        }
        return answer;
    }
}