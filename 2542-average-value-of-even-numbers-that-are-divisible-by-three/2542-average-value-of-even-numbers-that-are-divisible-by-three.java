class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int ctr=0;
        int avg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                sum+=nums[i];
                ctr++;
            }
        }
        if(ctr==0){
            avg=0;
        }
        else{
            avg=sum/ctr;
        }
        return avg;
    }
}