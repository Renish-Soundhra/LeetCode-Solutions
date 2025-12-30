class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int down = matrix[i + 1][j];
                int leftDiag = (j > 0) ? matrix[i + 1][j - 1] : Integer.MAX_VALUE;
                int rightDiag = (j < n - 1) ? matrix[i + 1][j + 1] : Integer.MAX_VALUE;
                matrix[i][j] += Math.min(down, Math.min(leftDiag, rightDiag));
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, matrix[0][j]);
        }
        return ans;
    }
}