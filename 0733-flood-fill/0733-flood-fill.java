class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    void dfs(int image[][],int r,int c,int color,int original){
        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c]!=original){
            return;
        }
        image[r][c]=color;
        dfs(image,r,c+1,color,original);
        dfs(image,r,c-1,color,original);
        dfs(image,r+1,c,color,original);
        dfs(image,r-1,c,color,original);
    }
}