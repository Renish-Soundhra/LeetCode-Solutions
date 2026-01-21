class Solution {
    public int minCost(int n, int[] cuts) {
        int m=cuts.length+2;
        int arr[]=new int[m];
        arr[0]=0;
        arr[m-1]=n;
        for(int i=1;i<m-1;i++){
            arr[i]=cuts[i-1];
        }
        Arrays.sort(arr);
        int dp[][]=new int[m][m];
        for(int len=2;len<m;len++){
            for(int i=0;i+len<m;i++){
                int j=i+len;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    int cost=dp[i][k]+dp[k][j]+(arr[j]-arr[i]);
                    dp[i][j]=Math.min(dp[i][j],cost);
                }
            }
        }
        return dp[0][m-1];
    }
}