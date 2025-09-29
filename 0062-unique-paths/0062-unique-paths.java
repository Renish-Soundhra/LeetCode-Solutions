class Solution {
    public int fun(int r,int c,int dp[][]){
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[r-1][c-1];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        return fun(m,n,dp);
    }
}