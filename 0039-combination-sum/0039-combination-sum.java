class Solution {
    public void combosum(int ind,int arr[],int target,List<Integer> ans,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(ind>=arr.length){
            return;
        }
        if(arr[ind]<=target){
            ans.add(arr[ind]);
            combosum(ind,arr,target-arr[ind],ans,res);
            ans.remove(ans.size()-1);
        }
        combosum(ind+1,arr,target,ans,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        combosum(0,candidates,target,ans,res);
        return res;
    }
}