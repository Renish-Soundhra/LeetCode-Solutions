class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || nums[mid]!=nums[mid-1]) && (mid==nums.length-1 || nums[mid]!=nums[mid+1])){
                return nums[mid];
            }
            else if(nums[mid]==nums[mid-1]){
                int size=mid-low+1;
                if(size%2!=0){
                    high=mid-2;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                int size=high-mid+1;
                if(size%2!=0){
                    low=mid+2;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1; 
    }
}