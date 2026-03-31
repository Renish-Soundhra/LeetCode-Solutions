class Solution {
    HashSet<List<Integer>> set=new HashSet<>();
    public void subseq(int ind,int nums[],List<Integer> ans,List<List<Integer>> res){
        if(ans.size()>=2 && !set.contains(ans)){
            res.add(new ArrayList<>(ans));
            set.add(new ArrayList<>(ans));
        }
        for(int i=ind;i<nums.length;i++){
            if(ans.isEmpty() || ans.get(ans.size()-1)<=nums[i]){
                ans.add(nums[i]);
                subseq(i+1,nums,ans,res);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        subseq(0,nums,ans,res);
        return res;
    }
}