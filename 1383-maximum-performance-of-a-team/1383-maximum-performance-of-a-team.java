class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        PriorityQueue<int[]> eff=new PriorityQueue<>((a,b)->b[0]-a[0]);
        PriorityQueue<Integer> spe=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            eff.offer(new int[]{efficiency[i],i});
        }
        long per=0;
        long sp=0;
        long mod=1000000007;
        for(int i=0;i<n;i++){
            int e[]=eff.poll();
            int effi=e[0];
            int ind=e[1];
            spe.offer(speed[ind]);
            if(spe.size()>k){
                sp-=spe.poll();
            }
            sp+=speed[ind];
            per=Math.max(per,sp*effi);
        }
        return (int)(per%mod);
    }
}