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
    static int result;
    static int ctr;
    private void inorder(TreeNode root,int k){
        if(root==null){
            return;
        }
        inorder(root.left,k);
        ctr++;
        if(ctr==k){
            result=root.val;
            return;
        }
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        result=-1;
        ctr=0;
        inorder(root,k);
        return result;
    }
}