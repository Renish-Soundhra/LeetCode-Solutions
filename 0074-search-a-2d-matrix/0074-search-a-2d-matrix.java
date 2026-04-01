class Solution {
    public boolean bsearch(int nums[],int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return true;
            }
            else if(nums[m]>target){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result=false;
        for(int m[]:matrix){
            result=result || bsearch(m,target);
            if(result){
                return result;
            }
        }
        return result;
    }
}