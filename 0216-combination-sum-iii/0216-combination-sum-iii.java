class Solution {
    private List<List<Integer>> combination(int ind,int size,int target,List<List<Integer>> ans,List<Integer> path){
        if(target==0 && path.size()==size){
            ans.add(new ArrayList<>(path));
            return ans;
        }
        for(int i=ind;i<=9;i++){
            if(i<=target){
                path.add(i);
                combination(i+1,size,target-i,ans,path);
                path.remove(path.size()-1);
            }
        }
        return ans;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        combination(1,k,n,ans,new ArrayList<>());
        return ans;
    }
}