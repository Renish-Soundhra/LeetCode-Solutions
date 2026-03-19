class Solution {
    public int find(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int sum=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            sum+=j-i+1;
            j++;
        }
        return sum;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return find(nums,k)-find(nums,k-1);
    }
}