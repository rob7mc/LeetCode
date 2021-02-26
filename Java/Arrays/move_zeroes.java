// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i]; // [0,1,3] - ignores the 0 and adds 1 to index 0, increments the index so 3 will be added to index 1 on the next loop, therefore [1,3,3]
            }
        }
        for(int i=index; i<nums.length; i++){
            nums[i] = 0; // [0,1,3] - already at [1,3,3] from last part, starts at 2 and goes to less than length 3, therefore [1,3,0]
        }
    }
}