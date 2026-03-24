class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            int max=0;
            int val=0;
            for(int t:map.keySet()){
                if(map.get(t)>max){
                    max=map.get(t);
                    val=t;
                }
            }
            arr[i]=val;
            map.remove(val);
        }
        return arr;
    }
}