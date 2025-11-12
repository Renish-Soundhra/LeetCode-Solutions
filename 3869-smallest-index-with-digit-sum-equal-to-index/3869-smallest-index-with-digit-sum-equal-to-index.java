class Solution {
    public int digitsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            nums[i]=digitsum(nums[i]);
            if(nums[i]==i){
                ans=i;
                break;
            }
        }
        return ans;
    }
}