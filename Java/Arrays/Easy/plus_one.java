/* 
    Given a non-empty array of decimal digits representing a non-negative integer, 
    increment one to the integer.

    The digits are stored such that the most significant digit is at the head of the list, 
    and each element in the array contains a single digit.

    You may assume the integer does not contain any leading zero, except the number 0 itself.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){ // If digits is nothing send back 1
            return new int[]{1};
        }
        for(int i=digits.length-1; i>=0; i--){ // Count down through array
            if(digits[i] == 9){ // If the digit is 9 make it 0
                digits[i] = 0;
            }
            else{ // Otherwise add 1 to it
                digits[i] += 1;
                break;
            }
        }
        if(digits[0] == 0){ // If the first digit in digits is 0, 1 needs to be appended onto the beginning, e.g. 999 goes to 000 therefore add 1 to make it 1000
            int[] digitsNew = new int[digits.length + 1];
            digitsNew[0] = 1;
            return digitsNew;
        }
        else{ // Otherwise return the answer
            return digits;
        }
    }
}