/*
    Given the root of a binary tree, return the inorder traversal of its nodes' values.
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
    public List<Integer> list = new ArrayList();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }
    
    public void inOrder(TreeNode root){
        if(root != null){
            if(root.left != null){
                inOrder(root.left);
            }
            list.add(root.val);
            if(root.right != null){
                inOrder(root.right);
            }
        }
    }
}