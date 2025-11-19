class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int tot=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]==k){
                tot++;
            }
            if(nums[i]<k){
                min++;
            }
        }
        if(tot==nums.length){
            return 0;
        }
        if(min>0){
            return -1;
        }
        int ctr=0;
        for(int n:set){
            if(n>k){
                ctr++;
            }
        }
        if(ctr==0){
            ctr=-1;
        }
        return ctr;
    }
}