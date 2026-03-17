class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(new int[] {i,tickets[i]});
        }
        int time=0;
        while(!q.isEmpty()){
            int arr[]=q.poll();
            arr[1]--;
            time++;
            if(arr[0]==k && arr[1]==0){
                break;
            }
            if(arr[1]>0){
                q.offer(arr);
            }
        }
        return time;
    }
}