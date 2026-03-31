class Solution {
    public int dfs(int r,int c,int row,int col,int grid[][],boolean visited[][]){
        if(r>=row || r<0 || c>=col || c<0 || visited[r][c] || grid[r][c]==0){
            return 0;
        }
        int cost=grid[r][c];
        visited[r][c]=true;
        cost+=Math.max(Math.max(dfs(r+1,c,row,col,grid,visited),
        dfs(r-1,c,row,col,grid,visited)),Math.max(
        dfs(r,c+1,row,col,grid,visited),
        dfs(r,c-1,row,col,grid,visited)));
        visited[r][c]=false;
        return cost;
    }
    public int getMaximumGold(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0 && !visited[i][j]){
                    int cost=dfs(i,j,m,n,grid,visited);
                    max=Math.max(max,cost);
                }
            }
        }
        return max;
    }
}