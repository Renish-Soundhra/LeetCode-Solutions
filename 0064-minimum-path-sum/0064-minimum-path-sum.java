class Solution {
    public int minPathSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(i-1<0 && j-1<0){
                    continue;
                }
                else if(i-1<0){
                    grid[i][j]+=grid[i][j-1];
                }
                else if(j-1<0){
                    grid[i][j]+=grid[i-1][j];
                }
                else{
                    grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }
            }
        }
        return grid[R-1][C-1];
    }
}