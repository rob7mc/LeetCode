/*
    Given the root of a binary tree, return the level order traversal of its nodes' values. 
    (i.e., from left to right, level by level).
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
    public ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<Integer> l = new ArrayList<Integer>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrderUtil(root);
        return list;
    }
    
    public void levelOrderUtil(TreeNode root){
        if(root != null){
            LinkedList<TreeNode> current = new LinkedList<TreeNode>();
            LinkedList<TreeNode> next = new LinkedList<TreeNode>();
            current.add(root);
 
            while(!current.isEmpty()){
                TreeNode node = current.remove();
 
                if(node.left != null)
                    next.add(node.left);
                if(node.right != null)
                    next.add(node.right);
                l.add(node.val);
                
                if(current.isEmpty()){
                    current = next;
                    next = new LinkedList<TreeNode>();
                    list.add(l);
                    l = new ArrayList();
                }
 
            }
        }
    }
}