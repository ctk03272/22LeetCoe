/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.val == 2){
            int a;
            return evaluateTree(root.left) || evaluateTree(root.right);
        }else if(root.val==3){
            return evaluateTree(root.left) && evaluateTree(root.right);
        }else{
     
            return root.val==1?true:false;
        }
    }
}