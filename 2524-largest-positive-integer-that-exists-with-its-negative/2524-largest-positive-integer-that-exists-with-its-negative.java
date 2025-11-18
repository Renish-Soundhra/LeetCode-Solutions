class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[0],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(map.getOrDefault(nums[i]*-1,0)>0){
                    max=Math.max(max,nums[i]);
                }
            }
        }
        return max;
    }
}