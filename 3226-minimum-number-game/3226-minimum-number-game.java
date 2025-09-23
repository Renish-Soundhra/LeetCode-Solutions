class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        int arr[]=new int[nums.length];
        int i=0;
        while(!q.isEmpty()){
            int a=q.poll();
            int b=q.poll();
            arr[i]=b;
            arr[i+1]=a;
            i+=2;
        }
        return arr;
    }
}