class Solution {
    public int fun(int r,int c,int dp[][],int grid[][]){
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(grid[i][j]!=1){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[r-1][c-1];
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            if(grid[i][0]!=1){
                dp[i][0]=1;
            }
            else{
                break;
            }
        }
        for(int i=0;i<c;i++){
            if(grid[0][i]!=1){
                dp[0][i]=1;
            }
            else{
                break;
            }
        }
        return fun(r,c,dp,grid);
    }
}