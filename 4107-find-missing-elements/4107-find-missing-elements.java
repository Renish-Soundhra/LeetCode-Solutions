class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=min;i<=max;i++){
            if(map.getOrDefault(i,0)==0){
                list.add(i);
            }
        }
        return list;
    }
}