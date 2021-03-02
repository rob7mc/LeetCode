// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

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
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }
    
    public boolean compare(TreeNode N1, TreeNode N2){
        if(N1 == null && N2 == null){return true;} // If they both equal null then either both trees are empty and they are equal or both trees have been fully chekced true and at that stage are therefore equal
        if(N1 == null || N2 == null){return false;} // If one or the other is null then the trees don't equal
        return (N1.val == N2.val) && compare(N1.left, N2.right) && compare(N1.right, N2.left); // If all N1 and N2 values being compared match, all left.left nodes match all right.right nodes and all left.right nodes match all right.left nodes, return true
    }
}