class Solution {
    public boolean even(int n){
        int ctr=0;
        while(n>0){
            ctr++;
            n/=10;
        }
        if(ctr%2==0){
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int ctr=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                ctr++;
            }
        }
        return ctr;
    }
}