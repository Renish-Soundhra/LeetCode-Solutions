class Solution {
    public int countBattleships(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        boolean vis[][]=new boolean[row][col];
        int ctr=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='X' && !vis[i][j]){
                    dfs(board,i,j,row,col,vis);
                    ctr++;
                }
            }
        }
        return ctr;
    }
    void dfs(char board[][],int r,int c,int row,int col,boolean vis[][]){
        if(r<0 || r>=row || c<0 || c>=col || vis[r][c] || board[r][c]!='X'){
            return;
        }
        vis[r][c]=true;
        dfs(board,r+1,c,row,col,vis);
        dfs(board,r-1,c,row,col,vis);
        dfs(board,r,c+1,row,col,vis);
        dfs(board,r,c-1,row,col,vis);
    }
}