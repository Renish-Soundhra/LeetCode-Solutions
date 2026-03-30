class Solution {
    public void combosum(int ind,int n,int k,List<Integer> ans,List<List<Integer>> res){
        if(n==0 && k==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<=9;i++){
            if(i>n){
                return;
            }
            else{
                ans.add(i);
                combosum(i+1,n-i,k-1,ans,res);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        combosum(1,n,k,ans,res);
        return res;
    }
}