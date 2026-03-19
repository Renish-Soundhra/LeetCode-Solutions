class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0,max=0,sum=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            while(map.get(nums[j])>1){
                map.put(nums[i],map.get(nums[i])-1);
                sum-=nums[i];
                i++;
            }
            max=Math.max(max,sum);
            j++;
        }
        return max;
    }
}