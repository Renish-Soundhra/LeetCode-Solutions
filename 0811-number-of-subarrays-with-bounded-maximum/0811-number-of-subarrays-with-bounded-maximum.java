class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count=0;
        int start=0;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=left && nums[i]<=right){
                last=i;
            }
            if(nums[i]>right){
                start=i+1;
            }
            if(last>=start){
                count+=(last-start+1);
            }
        }
        return count;
    }
}