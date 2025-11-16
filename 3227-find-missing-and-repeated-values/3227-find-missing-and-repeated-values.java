class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int num=grid[i][j];
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int r=0;
        int m=0;
        for(int s:map.keySet()){
            if(map.getOrDefault(s,0)==2){
                r=s;
            }
        }
        for(int k=1;k<=grid.length*grid.length;k++){
            if(map.getOrDefault(k,0)==0){
                m=k;
            }
        }
        return new int[]{r,m};
    }
}