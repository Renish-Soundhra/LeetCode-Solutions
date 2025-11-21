class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int j:map.keySet()){
            if(map.get(j)==n){
                ans=j;
            }
        }
        return ans;
    }
}