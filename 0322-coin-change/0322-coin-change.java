class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int dp[]=new int[amount+1];
        for(int i=1;i<dp.length;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int n:coins){
            for(int i=n;i<=amount;i++){
                if(dp[i-n]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i-n]+1,dp[i]);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}