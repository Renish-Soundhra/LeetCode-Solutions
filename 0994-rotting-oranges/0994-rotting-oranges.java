class Solution {
    class Pair{
        int i;
        int j;
        int time;
        Pair(int i,int j,int time){
            this.i=i;
            this.j=j;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int fresh=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                    vis[i][j]=true;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int i=temp.i;
            int j=temp.j;
            int t=temp.time;
            time=Math.max(time,t);
            if(i-1>=0 && !vis[i-1][j] && grid[i-1][j]==1){
                q.offer(new Pair(i-1,j,t+1));
                vis[i-1][j]=true;
                fresh--;
            }
            if(j-1>=0 && !vis[i][j-1] && grid[i][j-1]==1){
                q.offer(new Pair(i,j-1,t+1));
                vis[i][j-1]=true;
                fresh--;
            }
            if(j+1<n && !vis[i][j+1] && grid[i][j+1]==1){
                q.offer(new Pair(i,j+1,t+1));
                vis[i][j+1]=true;
                fresh--;
            }
            if(i+1<m && !vis[i+1][j] && grid[i+1][j]==1){
                q.offer(new Pair(i+1,j,t+1));
                vis[i+1][j]=true;
                fresh--;
            }
        }
        return fresh==0?time:-1;
    }
}