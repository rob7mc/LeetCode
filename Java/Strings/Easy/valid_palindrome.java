// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); // Only keeps letters and numbers and makes everything lowercase
        char[] c = new char[s.length()];
        for(int i=0; i<s.length(); i++){ // Make charatcer array (C) for string
            c[i] = s.charAt(i);
        }
        int count = 0;
        char[] c2 = new char[s.length()];
        for(int j=s.length()-1; j>=0; j--){ // Reverse character array (C2)
            c2[count] = c[j];
            count++;
        }
        for(int k=0; k<s.length(); k++){ // Compare both arrays C and C2
            if(c2[k] != c[k]){
                return false;
            }
        }
        return true;
    }
}