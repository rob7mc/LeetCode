/*
    Given an integer array nums and an integer k, return the kth largest element in the array.

    Note that it is the kth largest element in the sorted order, not the kth distinct element.

    Example 1:

    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5

    Example 2:

    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] > nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[k-1];
    }
}