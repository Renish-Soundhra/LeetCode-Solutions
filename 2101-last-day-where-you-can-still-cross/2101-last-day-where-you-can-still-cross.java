class Solution {
    int diff[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1},{-1,-1},{1,1},{1,-1},{-1,1}};
    private int find(int node,int leader[]){
        if(node==leader[node]){
            return node;
        }
        leader[node]=find(leader[node],leader);
        return leader[node];
    }
    private void join(int left,int right,int[] leader){
        leader[find(right,leader)]=find(left,leader);
    }
    private int getarrind(int R,int C,int row,int col){
        return row*C+col+1;
    }
    public int latestDayToCross(int R, int C, int[][] cells) {
        int leader[]=new int[R*C+2];
        int days=0;
        for(int i=0;i<R*C+2;i++){
            leader[i]=i;
        }
        boolean water[][]=new boolean[R][C];
        for(int cell[]:cells){
            int row=cell[0]-1;
            int col=cell[1]-1;
            water[row][col]=true;
            for(int i=0;i<8;i++){
                int adjr=row+diff[i][0];
                int adjc=col+diff[i][1];
                if(adjr>=0 && adjr<R && adjc>=0 && adjc<C){
                    if(water[adjr][adjc]){
                        join(getarrind(R,C,adjr,adjc),getarrind(R,C,row,col),leader);
                    }
                }
            }
            if(col==0){
                join(0,getarrind(R,C,row,col),leader);
            }
            if(col==C-1){
                join(getarrind(R,C,row,col),R*C+1,leader);
            }
            if(find(leader[0],leader)==find(leader[R*C+1],leader)){
                return days;
            }
            days++;
        }
        return -1;
    }
}