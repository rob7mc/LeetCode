/*
    Given an array of integers nums sorted in ascending order, find 
    the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.

    Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]

    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]

    Example 3:

    Input: nums = [], target = 0
    Output: [-1,-1]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] answer = new int[2];
        
        while(start < end){
            int mid = start+(end-start) / 2;
            
            if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        
        int temp = start;
        if(temp < nums.length && nums[temp] == target){
            temp = 0;
            end = nums.length-1;
            while(temp < end){
                int mid = temp+(end-temp+1) / 2;
                
                if(nums[mid] > target){
                    end = mid-1;
                }
                else{
                    temp = mid;
                }
            }
            return new int[]{start, end};
        }
        return new int[]{-1,-1};
    }
}