// Given an array, rotate the array to the right by k steps, where k is non-negative.

class Solution {
    public void rotate(int[] nums, int k) {
        int temp;
        int prev;
        for(int i=0; i<k; i++){
            prev = nums[nums.length-1];
            for(int j=0; j<nums.length; j++){
                temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
        }
    }
}