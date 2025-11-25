class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return new int[0];
        }
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        map.put(nums[0],rank);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                rank++;
                map.put(nums[i],rank);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=map.get(arr[i]);
        }
        return nums;
    }
}