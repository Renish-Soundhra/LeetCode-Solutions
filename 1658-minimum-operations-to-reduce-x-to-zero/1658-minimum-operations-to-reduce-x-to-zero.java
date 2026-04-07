class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        total-=x;
        int sum=0;
        int i=0,j=0;
        int maxi=-1;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>total && i<=j){
                sum-=nums[i];
                i++;
            }
            if(sum==total){
                maxi=Math.max(maxi,j-i+1);
            }
            j++;
        }
        if(maxi==-1){
            return maxi;
        }
        return nums.length-maxi;
    }
}