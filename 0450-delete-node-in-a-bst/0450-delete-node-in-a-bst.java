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
    public TreeNode helper(TreeNode curr){
        if(curr.left==null){
            return curr.right;
        }
        else if(curr.right==null){
            return curr.left;
        }
        else{
            TreeNode temp=curr.left;
            TreeNode lm=curr.right;
            while(lm.left!=null){
                lm=lm.left;
            }
            lm.left=temp;
            return curr.right;
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        TreeNode dummy=root;
        if(root.val==key){
            return helper(root);
        }
        while(root!=null){
            if(root.val<key){
                if(root.right!=null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }
                else{
                    root=root.right;
                }
            }
            else{
                if(root.left!=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }
                else{
                    root=root.left;
                }
            }
        }
        return dummy;
    }
}