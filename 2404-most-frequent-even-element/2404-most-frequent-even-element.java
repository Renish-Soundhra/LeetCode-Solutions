class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(nums[i]%2==0){
                max=Math.max(max,map.get(nums[i]));
            }
        }
        for(int k:map.keySet()){
            if(map.get(k)==max && k%2==0){
                ans=Math.min(ans,k);
            }
        }
        if(ans==Integer.MAX_VALUE){
            ans=-1;
        }
        return ans;
    }
}