class Solution {
    int mod=1000000007;
    Integer dp[][];
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n=locations.length;
        dp=new Integer[n][fuel+1];
        return dfs(locations,start,finish,fuel);
    }
    private int dfs(int loc[],int cur,int finish,int fuel){
        if(fuel<0){
            return 0;
        }
        if(dp[cur][fuel]!=null){
            return dp[cur][fuel];
        }
        int ways=(cur==finish)?1:0;
        for(int i=0;i<loc.length;i++){
            if(i!=cur){
                int cost=Math.abs(loc[cur]-loc[i]);
                if(fuel>=cost){
                    ways=(ways+dfs(loc,i,finish,fuel-cost))%mod;
                }
            }
        }
        return dp[cur][fuel]=ways;
    }
}