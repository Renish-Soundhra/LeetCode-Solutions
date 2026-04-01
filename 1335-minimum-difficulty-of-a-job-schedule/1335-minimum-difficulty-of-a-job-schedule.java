class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(d>n){
            return -1;
        }
        else if(d==n){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=jobDifficulty[i];
            }
            return sum;
        }
        int dp[][]=new int[d+1][n];
        for(int e[]:dp){
            Arrays.fill(e,Integer.MAX_VALUE);
        }
        int max=jobDifficulty[0];
        dp[1][0]=max;
        for(int i=1;i<n;i++){
            max=Math.max(max,jobDifficulty[i]);
            dp[1][i]=max;
        }
        for(int day=2;day<=d;day++){
            for(int i=day-1;i<n;i++){
                int cmax=0;
                for(int j=i;j>=day-1;j--){
                    cmax=Math.max(cmax,jobDifficulty[j]);
                    dp[day][i]=Math.min(dp[day][i],dp[day-1][j-1]+cmax);
                }
            }
        }
        return dp[d][n-1];
    }
}