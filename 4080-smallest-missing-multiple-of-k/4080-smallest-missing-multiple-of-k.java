class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=1;
        int temp=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        }
        while(true){
            temp=i*k;
            if(!map.containsKey(temp)){
                break;
            }
            i++;
        }
        return temp;
    }
}