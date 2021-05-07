/*
    Given an integer array nums where the elements are sorted in ascending order, convert 
    it to a height-balanced binary search tree.

    A height-balanced binary tree is a binary tree in which the depth of the two subtrees 
    of every node never differs by more than one.
*/

/*
    Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
*/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        return sortedArrayToBSTUtil(nums, start, end);
    }
    
    public TreeNode sortedArrayToBSTUtil(int[] nums, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBSTUtil(nums, start, mid-1);
        node.right = sortedArrayToBSTUtil(nums, mid+1, end);
        return node;
    }
}