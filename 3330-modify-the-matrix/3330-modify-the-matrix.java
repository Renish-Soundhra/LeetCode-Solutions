class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int ans[][]=new int[r][c];
        int maxi[]=new int[c];
        for(int i=0;i<c;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<r;j++){
                max=Math.max(max,matrix[j][i]);
            }
            maxi[i]=max;
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                if(matrix[j][i]==-1){
                    ans[j][i]=maxi[i];
                }
                else{
                    ans[j][i]=matrix[j][i];
                }
            }
        }
        return ans;
    }
}