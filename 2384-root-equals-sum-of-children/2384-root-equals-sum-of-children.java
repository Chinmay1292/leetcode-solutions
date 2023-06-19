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
    public boolean checkTree(TreeNode root) {
        int left_data = 0, right_data = 0;

        if(root==null || (root.left == null && root.right==null)){
            return true;
        }
        else{
            if(root.left!=null){
                left_data = root.left.val;
            }
            if(root.right!=null){
                right_data = root.right.val;
            }
            if((root.val == left_data + right_data) && (checkTree(root.left)) && checkTree(root.right)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}