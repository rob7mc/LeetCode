/*
    Given the root of a binary tree, return the zigzag level order 
    traversal of its nodes' values. (i.e., from left to right, then 
    right to left for the next level and alternate between).

    Example 1:

    Input: root = [3,9,20,null,null,15,7]
    Output: [[3],[20,9],[15,7]]

    Example 2:

    Input: root = [1]
    Output: [[1]]

    Example 3:

    Input: root = []
    Output: []
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean zigzag = false;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> l = new ArrayList<Integer>();
            
            for(int i=0; i<size; i++){
                TreeNode node = queue.remove();
                l.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            
            if(zigzag){
                Collections.reverse(l);
            }
            zigzag = !zigzag;
            list.add(l);
        }
        
        return list;    
    }
}