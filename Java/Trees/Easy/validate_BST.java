/*
    Given the root of a binary tree, determine if it is a valid binary search tree (BST).

    A valid BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.
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
    public boolean isValidBST(TreeNode root) {
        return validation(root, null, null);
    }
    
    public boolean validation(TreeNode root, Integer low, Integer high){
        if(root == null){return true;} // If tree is empty then it's BST
        if(low != null && low >= root.val){return false;} // If the left node isn't null but is greater than or equal to the root value then it's not BST
        if(high != null && high <= root.val){return false;} // If the right node isn't null but is less than or equal to the root value then it's not BST
        return validation(root.left, low, root.val) && validation(root.right, root.val, high);
    }
}