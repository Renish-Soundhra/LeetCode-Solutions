class Solution {
    private void dfs(int r,int c, char grid[][], int row, int col)
    {
        if(row>=r || row<0 || col>=c || col<0 || grid[row][col]!='1'){
            return;
        }
        grid[row][col]='0';
        dfs(r,c,grid,row+1,col);
        dfs(r,c,grid,row-1,col);
        dfs(r,c,grid,row,col+1);
        dfs(r,c,grid,row,col-1);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int island=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    island++;
                    dfs(m,n,grid,i,j);
                }
            }
        }
        return island;
    }
}