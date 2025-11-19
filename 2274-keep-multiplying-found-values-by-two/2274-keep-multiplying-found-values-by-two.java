class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[0],0)+1);
        }
        while(true){
            if(map.getOrDefault(original,0)==0){
                break;
            }
            else{
                original*=2;
            }
        }
        return original;
    }
}