class Solution {
    public boolean canJump(int[] nums) {
        int remaining=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && remaining==0){
                return false;
            }
            remaining=Math.max(remaining-1,nums[i]-1);
        }
        return true;
    }
}