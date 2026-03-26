class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutation(nums,0);
        return res;
    }
    public void permutation(int nums[],int idx){
        if(idx==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int n:nums){
                list.add(n);
            }
            res.add(list);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            permutation(nums,idx+1);
            swap(nums,i,idx);
        }
    }
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}