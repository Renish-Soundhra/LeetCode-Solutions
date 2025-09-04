class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> vacancy=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:nums){
            if(map.get(num)==0){
                continue;
            }
            else if(vacancy.getOrDefault(num,0)>0){
                map.put(num,map.get(num)-1);
                vacancy.put(num,vacancy.get(num)-1);
                vacancy.put(num+1,vacancy.getOrDefault(num+1,0)+1);
            }
            else if(map.getOrDefault(num,0)>0 && map.getOrDefault(num+1,0)>0 && map.getOrDefault(num+2,0)>0){
                map.put(num,map.get(num)-1);
                map.put(num+1,map.get(num+1)-1);
                map.put(num+2,map.get(num+2)-1);
                vacancy.put(num+3,vacancy.getOrDefault(num+3,0)+1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}