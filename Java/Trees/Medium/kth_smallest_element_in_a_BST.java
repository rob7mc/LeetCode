/*
    Given the root of a binary search tree, and an integer k, 
    return the kth (1-indexed) smallest element in the tree.

    Example 1:

    Input: root = [3,1,4,null,2], k = 1
    Output: 1

    Example 2:

    Input: root = [5,3,6,2,4,null,null,1], k = 3
    Output: 3
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
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    public int kthSmallest(TreeNode root, int k) {
        kthSmallestUtil(root);
        Collections.sort(list);
        return list.get(k-1);
    }
    
    public void kthSmallestUtil(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left != null){
            kthSmallestUtil(root.left);
        }
        if(root.right != null){
            kthSmallestUtil(root.right);
        }
    }
}

