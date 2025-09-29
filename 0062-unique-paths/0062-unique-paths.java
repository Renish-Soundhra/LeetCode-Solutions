class Solution {
    public int dfs (int i,int j,int R,int C, int[][] dp) {
        if ( i==R || j==C) return 0;
        if (i==R-1 && j==C-1) return 1;
        if (dp[i][j]!=0) return dp[i][j] ;
        dp[i][j] = dfs(i+1,j,R,C,dp) + dfs(i,j+1,R,C,dp) ;
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int [m][n] ;
        return  dfs(0,0,m,n,dp) ;
    }
}