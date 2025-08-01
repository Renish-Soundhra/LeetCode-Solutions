class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int i=0;
        while(i<nums.length && i<=k){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
            i++;
        }
        while(i<nums.length){
            set.remove(nums[i-k-1]);
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
            i++;
        }
        return false;
    }
}