/*
    Implement strStr().

    Return the index of the first occurrence of needle in haystack, 
    or -1 if needle is not part of haystack.

    Clarification:

    What should we return when needle is an empty string? This is a great 
    question to ask during an interview.

    For the purpose of this problem, we will return 0 when needle is an empty 
    string. This is consistent to C's strstr() and Java's indexOf().
*/

class Solution {
    public int strStr(String haystack, String needle) {
        int answer = 0;
        if(needle == null){answer = 0;}
        if(haystack.contains(needle)){
            answer = haystack.indexOf(needle);;
        }
        if(!haystack.contains(needle)){answer = -1;}
        return answer;
    }
}