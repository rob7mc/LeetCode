/*
    Given two integer arrays preorder and inorder where preorder is the preorder 
    traversal of a binary tree and inorder is the inorder traversal of the same tree, 
    construct and return the binary tree.
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
    int preOrderIndex = 0;
    HashMap<Integer, Integer> inOrderIndexMap = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++){
            inOrderIndexMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, inorder, 0, preorder.length-1);
    }
    
    private TreeNode arrayToTree(int[] preorder, int[] inorder, int left, int right){
        if(left>right){
            return null;
        }
        int rootValue = preorder[preOrderIndex++];
        TreeNode root = new TreeNode(rootValue);
        root.left = arrayToTree(preorder, inorder, left, inOrderIndexMap.get(rootValue)-1);
        root.right = arrayToTree(preorder, inorder, inOrderIndexMap.get(rootValue)+1, right);
        return root;
    }
}