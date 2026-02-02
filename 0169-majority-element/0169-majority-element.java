class Solution {
    public int majorityElement(int[] nums) {
        int ctr=0;
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(ctr==0){
                val=nums[i];
                ctr++;
            }
            else if(val==nums[i]){
                ctr++;
            }
            else{
                ctr--;
            }
        }
        return val;
    }
}