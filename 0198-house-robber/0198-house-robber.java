class Solution {
    public int fun(int n,int nums[],int dp[]){
        if(n>=nums.length){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int take=nums[n]+fun(n+2,nums,dp);
        int nottake=fun(n+1,nums,dp);
        dp[n]=Math.max(take,nottake);
        return dp[n];
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(0,nums,dp);
    }
}