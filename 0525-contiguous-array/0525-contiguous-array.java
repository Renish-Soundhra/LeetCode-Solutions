class Solution {
    int[] nums;
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int n=nums.length;
        int maxlen=0;
        int cumusum=0;
        int one=0;
        int zero=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if (nums[i]==1){
                one+=1;
            }
            else{
                zero+=1; 
            }
            int diff=zero-one;
           if (map.containsKey(diff)) { 
                int mapDiff =  i - map.get(diff);
                count = count > mapDiff ? count : mapDiff ;
            } else {
                map.put(diff, i);
            }

        }
        return count;

    }
}