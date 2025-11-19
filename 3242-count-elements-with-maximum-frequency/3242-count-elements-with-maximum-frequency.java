class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int n:map.values()){
            max=Math.max(max,n);
        }
        int ctr=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==max){
                ctr++;
            }
        }
        return ctr;
    }
}