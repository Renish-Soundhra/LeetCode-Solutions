class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:set){
            heap.add(n);
        }
        for(int i=0;i<k;i++){
            if(!heap.isEmpty()){
                list.add(heap.poll());
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}