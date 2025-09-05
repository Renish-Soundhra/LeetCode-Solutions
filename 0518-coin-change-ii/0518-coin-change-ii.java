class Solution {
    public int change(int amount, int[] coins) {
        int dp[]=new int[amount+1];
        Arrays.sort(coins);
        dp[0]=1;
        for(int n:coins){
            for(int i=n;i<=amount;i++){
                dp[i]+=dp[i-n];
            }
        }
        return dp[amount];
    }
}