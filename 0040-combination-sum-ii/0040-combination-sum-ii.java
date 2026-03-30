class Solution {
    public void combosum(int ind,int arr[],int target,List<Integer> ans,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                return;
            }
            else{
                ans.add(arr[i]);
                combosum(i+1,arr,target-arr[i],ans,res);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combosum(0,candidates,target,ans,res);
        return res;
    }
}