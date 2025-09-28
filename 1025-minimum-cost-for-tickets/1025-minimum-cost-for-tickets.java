class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int len=days.length;
        int dp[]=new int[days[len-1]+1];
        int last=days[len-1];
        int k=0;
        for(int i=days[0];i<=last;i++){
            if(days[k]==i){
                dp[i]=costs[0]+dp[i-1];
                dp[i]=Math.min(dp[i],dp[Math.max(i-7,0)]+costs[1]);
                dp[i]=Math.min(dp[i],dp[Math.max(i-30,0)]+costs[2]);
                k++;
            }
            else{
                dp[i]=dp[i-1];
            }
        }
        return dp[last];
    }
}