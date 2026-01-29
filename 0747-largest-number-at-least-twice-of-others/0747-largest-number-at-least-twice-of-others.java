class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                ind=i;
                continue;
            }
            else{
                if(nums[i]*2>max){
                    return -1;
                }
            }
        }
        return ind;
    }
}