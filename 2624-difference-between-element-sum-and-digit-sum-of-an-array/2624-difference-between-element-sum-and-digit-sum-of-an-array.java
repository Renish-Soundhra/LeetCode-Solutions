class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digsum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            elesum+=n;
            while(n>0){
                int t=n%10;
                digsum+=t;
                n/=10;
            }
        }
        return Math.abs(elesum-digsum);
    }
}