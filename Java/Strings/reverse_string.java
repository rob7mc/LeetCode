/*
    Write a function that reverses a string. The input string is given as an array of characters char[].

    Do not allocate extra space for another array, you must do this by modifying the input array 
    in-place with O(1) extra memory.

    You may assume all the characters consist of printable ascii characters.
*/

class Solution {
    public void reverseString(char[] s) {
        // Method 1 - Allocate New Space for Array
        //char[] r = new char[s.length];
        //int count = 0;
        //for(int i=s.length-1; i>=0; i--){
            //r[count] = s[i];
            //count++;
        //}
        //for(int j=0; j<r.length; j++){
            //s[j] = r[j];
        //}
        
        // Method 2 - Modify Array Given Directly (In Place)
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}