/*
    Given an integer array nums, return all the triplets 
    [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, 
    and nums[i] + nums[j] + nums[k] == 0

    Example 1:

    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]

    Example 2:

    Input: nums = []
    Output: []

    Example 3:

    Input: nums = [0]
    Output: []
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            
            // Stops duplicate answers
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            
            while(j<k){
                // Stops duplicate answers
                if(k<nums.length-1 && nums[k] == nums[k+1]){
                    k--;
                    continue;
                }
                
                if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }
                else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }
                else{
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    answer.add(l);
                    k--;
                    j++;
                }
            }
        }
        return answer;
    }
}