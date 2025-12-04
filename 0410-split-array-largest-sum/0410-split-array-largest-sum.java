class Solution {
    public int calculate(int n,int[] arr){
        int ctr=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>n){
                ctr++;
                sum=arr[i];
            }
        }
        return ctr;
    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(calculate(mid,nums)>k){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}