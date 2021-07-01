/*
    Write a function that takes an unsigned integer and returns the number of '1' bits 
    it has (also known as the Hamming weight).

    Example 1:

    Input: n = 00000000000000000000000000001011
    Output: 3
    Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

    Example 2:

    Input: n = 00000000000000000000000010000000
    Output: 1
    Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.

    Example 3:

    Input: n = 11111111111111111111111111111101
    Output: 31
    Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
*/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for(int i=0; i<32; i++){
            // Logical AND will only give 1 when (A = 1, B = 1), which means a bit is found
            if((n & mask) != 0){
                bits++;
            }
            // Keeps adding one bit to the right of mask each time (1, 11, 111...)
            mask <<= 1;
        }
        return bits;
    }
}