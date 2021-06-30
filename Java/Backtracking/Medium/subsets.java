/*
    Given an integer array nums of unique elements, return all possible subsets (the power set).

    The solution set must not contain duplicate subsets. Return the solution in any order.

    Example 1:

    Input: nums = [1,2,3]
    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

    Example 2:

    Input: nums = [0]
    Output: [[],[0]]
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Creates the overall array list
        List<List<Integer>> list = new ArrayList();
        // Adds empty array list
        list.add(new ArrayList<Integer>());
        
        // For each number in the nums array
        for(int num : nums) {
            // A new double array list is created
            List<List<Integer>> list2 = new ArrayList();
            // For each array list in the overall double list
            for(List<Integer> l : list) {
                // They are added to the new array list with the current number
                list2.add(
                    new ArrayList<Integer>(l){
                        {add(num);}
                    }
                );
            }
            // Contents of the new double array list for the current number are dumped into the overall double list
            for(List<Integer> l2 : list2) {
                list.add(l2);
            }
        }
        // This overall double list is returned
        return list;
    }
}

/* The list is loaded with an empty array initially, then the loop basically keeps copying the 
current state of the list adding the latest number to it and then adding back the new arraylists 
to the previous arraylists in list. This way all combinations are achieved. */