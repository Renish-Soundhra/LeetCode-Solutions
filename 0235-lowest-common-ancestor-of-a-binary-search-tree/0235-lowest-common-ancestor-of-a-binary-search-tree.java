/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode x, TreeNode y) {
        if(root==null){
            return root;
        }
        if(root.val<x.val && root.val<y.val){
            return lowestCommonAncestor(root.right,x,y);
        }
        if(root.val>x.val && root.val>y.val){
            return lowestCommonAncestor(root.left,x,y);
        }
        return root;
    }
}