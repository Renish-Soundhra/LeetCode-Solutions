class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        int start=0;
        int end=0;
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>1){
                map.put(nums[j],map.get(nums[j])-1);
                j++;
            }
            i++;
            start=j;
            end=i;
            int sum=0;
            for(int k=start;k<end;k++){
                sum+=nums[k];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}