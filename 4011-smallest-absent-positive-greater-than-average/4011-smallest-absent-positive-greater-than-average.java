class Solution {
    public int smallestAbsent(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        int avg=sum/len;
        if(avg<0){
            avg=0;
        }
        while(true){
            avg++;
            if(map.getOrDefault(avg,0)==0){
                break;
            }
        }
        return avg;
    }
}