class Solution {
    public boolean canAliceWin(int[] nums) {
        int onesum=0;
        int twosum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                twosum+=nums[i];
            }
            else{
                onesum+=nums[i];
            }
        }
        if(onesum==twosum){
            return false;
        }
        return true;
    }
}