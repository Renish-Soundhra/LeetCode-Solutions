class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[0]!=nums[i]){
                ans=1;
                break;
            }
        }
        return ans;
    }
}