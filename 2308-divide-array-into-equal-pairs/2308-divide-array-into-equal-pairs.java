class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        int pair=n/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ways=0;
        for(int i:map.keySet()){
            ways+=map.get(i)/2;
        }
        return ways==pair?true:false;
    }
}