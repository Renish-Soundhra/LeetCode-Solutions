class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean ans=true;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                list.add(i);
            }
        }
        for(int i=1;i<list.size();i++){
            int dif=Math.abs(list.get(i-1)-list.get(i))-1;
            if(dif<k){
                ans=false;
            }
        }
        return ans;
    }
}