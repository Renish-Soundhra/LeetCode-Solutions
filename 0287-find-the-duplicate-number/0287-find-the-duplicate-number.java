class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=1;
        if(nums.length==1){
            return 0;
        }
        while(j<nums.length){
            if(nums[i]==nums[j]){
                return nums[i];
            }
            else{
                i++;
                j++;
            }
        }
        return 0;
    }
}