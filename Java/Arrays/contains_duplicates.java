// Given an array of integers, find if the array contains any duplicates.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /* public static void main(String[] args) {
        int[] nums = new int[]{ 1,2,3,2 };
        if(new contains_duplicates().containsDuplicate(nums)){
            System.out.println("Duplicate Found!");
        }
        else{
            System.out.println("Duplicate Not Found!");
        }
    } */
}