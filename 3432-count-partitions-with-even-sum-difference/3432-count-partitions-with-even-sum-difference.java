class Solution {
    public int countPartitions(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        int ctr=0;
        int val=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]-(val-nums[i]))%2==0){
                ctr++;
            }
        }
        return ctr;
    }
}