class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            heap.add(n);
        }
        int n1=heap.poll();
        int n2=heap.poll();
        return (n1-1)*(n2-1);
    }
}