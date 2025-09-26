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
    public void travel(TreeNode root,HashSet<Integer> set){
        if(root==null){
            return;
        }
        set.add(root.val);
        travel(root.left,set);
        travel(root.right,set);
    }
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> set=new HashSet();
        travel(root,set);
        PriorityQueue<Integer> q=new PriorityQueue<>(set);
        if(q.size()<2){
            return -1;
        }
        q.poll();
        return q.poll();
    }
}