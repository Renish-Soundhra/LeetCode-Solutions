class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int maxsum=nums[0],currmax=nums[0];
        int minsum=nums[0],currmin=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            currmax=Math.max(nums[i],nums[i]+currmax);
            maxsum=Math.max(maxsum,currmax);
            currmin=Math.min(nums[i],nums[i]+currmin);
            minsum=Math.min(minsum,currmin);
            total+=nums[i];
        }
        total+=nums[0];
        if(maxsum<0) return maxsum;
        return Math.max(maxsum,total-minsum);
    }
}