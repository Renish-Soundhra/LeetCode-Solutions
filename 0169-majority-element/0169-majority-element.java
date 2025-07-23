class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxi=0;
        int ctr=1;
        int result=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ctr++;
            }
            else{
                if(ctr>maxi){
                    maxi=ctr;
                    result=nums[i];
                }
                ctr=1;
            }
        }
        if(ctr>maxi){
            result=nums[nums.length-1];
        }
        return result;
    }
}