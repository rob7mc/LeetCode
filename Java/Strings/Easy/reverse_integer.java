/*
    Given a signed 32-bit integer x, return x with its digits reversed. 
    If reversing x causes the value to go outside the signed 32-bit integer range 
    [-2^31, 2^31 - 1], then return 0.

    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/

import java.lang.Math;

class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while(x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        if(reversed >= -1*(Math.pow(2, 31)) && reversed <= Math.pow(2, 31)-1){
            int r = (int) reversed;
            return r;
        }
        else{return 0;}
    }
}