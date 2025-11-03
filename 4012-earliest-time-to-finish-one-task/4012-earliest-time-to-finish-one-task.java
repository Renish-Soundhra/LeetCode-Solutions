class Solution {
    public int earliestTime(int[][] tasks) {
        int n=tasks.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int arr[]=new int[tasks[i].length];
            int sum=0;
            for(int j=0;j<arr.length;j++){
                arr[j]=tasks[i][j];
                sum+=arr[j];
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}