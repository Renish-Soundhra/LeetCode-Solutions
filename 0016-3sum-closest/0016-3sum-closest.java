class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(ans-target)>=Math.abs(sum-target)){
                    ans=sum;
                }
                if(sum>target){
                    k--;
                }
                else if(sum==target){
                    return sum;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}