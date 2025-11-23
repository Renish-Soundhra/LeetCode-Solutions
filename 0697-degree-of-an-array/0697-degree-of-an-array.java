class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int arr[]=map.get(nums[i]);
                arr[1]=i;
                arr[2]++;
                map.put(nums[i],arr);
                max=Math.max(max,arr[2]);
            }
            else{
                int arr[]=new int[]{i,i,1};
                map.put(nums[i],arr);
                max=Math.max(max,1);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int arr[]=map.get(nums[i]);
            if(arr[2]==max){
                ans=Math.min(ans,(arr[1]-arr[0])+1);
            }
        }
        return ans;
    }
}