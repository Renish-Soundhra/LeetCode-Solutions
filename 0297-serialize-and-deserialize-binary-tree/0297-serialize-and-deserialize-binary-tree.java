/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        String res="";
        if(root==null){
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                res+="n ";
                continue;
            }
            res+=String.valueOf(curr.val)+" ";
            q.offer(curr.left);
            q.offer(curr.right);
        }
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode> q=new LinkedList<>();
        if(data.equals("")){
            return null;
        }
        String node[]=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(node[0]));
        q.offer(root);
        int i=1;
        while(!q.isEmpty() && i<node.length){
            TreeNode curr=q.poll();
            if(!node[i].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(node[i]));
                curr.left=left;
                q.offer(left);
            }
            if(!node[i+1].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(node[i+1]));
                curr.right=right;
                q.offer(right);
            }
            i+=2;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));