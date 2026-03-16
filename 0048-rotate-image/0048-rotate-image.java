class Solution {
    public void reverse(int[][] matrix){
        int row=matrix.length;
        for(int k=0;k<row;k++){
            int i=0;
            int j=matrix[0].length-1;
            while(i<=j){
                int num=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=num;
                i++;
                j--;
            }
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int num=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=num;
            }
        }
        reverse(matrix);
    }
}