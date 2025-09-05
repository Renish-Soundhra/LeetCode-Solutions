class Solution {
    private void combination(int index,int []arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(index==arr.length){
            return;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            combination(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        combination(index+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}