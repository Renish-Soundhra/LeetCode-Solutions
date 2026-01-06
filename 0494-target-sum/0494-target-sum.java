class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        if(Math.abs(target)>tot){
            return 0;
        }
        if((tot+target)%2!=0){
            return 0;
        }
        int p=(tot+target)/2;
        int dp[]=new int[p+1];
        dp[0]=1;
        for(int num:nums){
            for(int j=p;j>=num;j--){
                dp[j]+=dp[j-num];
            }
        }
        return dp[p];
    }
}