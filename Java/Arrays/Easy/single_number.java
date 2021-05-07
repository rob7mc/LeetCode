// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        int answer = nums[0];
        for(int i=1; i<nums.length; ++i){
            answer = answer ^ nums[i]; // XOR to find odd one out
        }
        return answer;
    }
}