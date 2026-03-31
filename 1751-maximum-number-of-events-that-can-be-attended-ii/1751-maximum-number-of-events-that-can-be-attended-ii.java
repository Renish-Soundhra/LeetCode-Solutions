class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        int n=events.length;
        int dp[][]=new int[n+1][k+1];
        return demo(events,0,k,dp);
    }
    private int demo(int e[][],int ind,int k,int dp[][]){
        if(ind==e.length || k==0){
            return 0;
        }
        if(dp[ind][k]!=0){
            return dp[ind][k];
        }
        int next=selectNext(e,e[ind][1]);
        int take=e[ind][2]+demo(e,next,k-1,dp);
        int skip=demo(e,ind+1,k,dp);
        return dp[ind][k]=Math.max(take,skip);
    }
    private int selectNext(int e[][],int end){
        int l=0,r=e.length;
        while(l<r){
            int m=l+(r-l)/2;
            if(e[m][0]>end){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}