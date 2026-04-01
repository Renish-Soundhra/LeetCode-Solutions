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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean nullseen=false;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr==null){
                    nullseen=true;
                }
                else{
                    if(nullseen){
                        return false;
                    }
                    if(curr.left==null && curr.right!=null){
                        return false;
                    }
                    q.offer(curr.left);
                    q.offer(curr.right);
                }
            }  
        }
        return true;
    }
}