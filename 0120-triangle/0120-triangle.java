class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        int dp[]=new int[triangle.size()];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<triangle.size();i++){
            dp[i]=triangle.get(triangle.size()-1).get(i);
        }
        for(int i=triangle.size()-2;i>=0;i--){
            List<Integer> tri=triangle.get(i);
            for(int j=0;j<tri.size();j++){
                dp[j]=Math.min(dp[j],dp[j+1])+tri.get(j);
            }
        }
        return dp[0];
    }
}