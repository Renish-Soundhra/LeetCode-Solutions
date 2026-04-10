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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        dp(root);
        return maxsum;
    }
    private int dp(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=Math.max(0,dp(node.left));
        int right=Math.max(0,dp(node.right));
        int cpath=left+node.val+right;
        maxsum=Math.max(maxsum,cpath);
        return node.val+Math.max(left,right);
    }
}