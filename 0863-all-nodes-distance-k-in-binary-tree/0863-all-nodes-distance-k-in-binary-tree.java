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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr=queue.poll();
            if(curr.left!=null){
                map.put(curr.left,curr);
                queue.offer(curr.left);
            }
            if(curr.right!=null){
                map.put(curr.right,curr);
                queue.offer(curr.right);
            }
        }
        int dist=0;
        Set<TreeNode> visited=new HashSet<>();
        queue.offer(target);
        visited.add(target);
        while(!queue.isEmpty()){
            if(dist==k){
                break;
            }
            dist++;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                if(curr.left!=null && !visited.contains(curr.left)){
                    queue.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    queue.offer(curr.right);
                    visited.add(curr.right);
                }
                if(map.get(curr)!=null && !visited.contains(map.get(curr))){
                    queue.offer(map.get(curr));
                    visited.add(map.get(curr));
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            list.add(temp.val);
        }
        return list;
    }
}