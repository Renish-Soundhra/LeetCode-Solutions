class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        subset(1,n,k,new ArrayList<>());
        return res;
    }
    public void subset(int ind,int n,int k,List<Integer> cur){
        if(cur.size()==k){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=ind;i<=n;i++){
            cur.add(i);
            subset(i+1,n,k,cur);
            cur.remove(cur.size()-1);
        }
    }
}