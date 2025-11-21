class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int dif=0;
        for(int i=0;i<nums.length-1;i++){
            dif=Math.max(dif,Math.abs(nums[i+1]-nums[i]));
        }
        dif=Math.max(dif,Math.abs(nums[nums.length-1]-nums[0]));
        return dif;
    }
}