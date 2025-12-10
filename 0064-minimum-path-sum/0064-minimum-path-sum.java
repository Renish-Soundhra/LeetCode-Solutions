class Solution {
    public int minPathSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int dp[]=new int[C];
        dp[0]=grid[0][0];
        for(int i=1;i<C;i++){
            dp[i]=dp[i-1]+grid[0][i];
        }
        for(int i=1;i<R;i++){
            for(int j=0;j<C;j++){
                if(j==0){
                    dp[0]+=grid[i][j];
                }
                else{
                    dp[j]=grid[i][j]+Math.min(dp[j],dp[j-1]);
                }
            }
        }
        return dp[C-1];
    }
}