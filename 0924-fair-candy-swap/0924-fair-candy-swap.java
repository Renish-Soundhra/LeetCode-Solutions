class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int suma=0;
        int sumb=0;
        for(int i:a){
            suma+=i;
        }
        for(int i:b){
            sumb+=i;
        }
        int diff=(sumb-suma)/2;
        HashSet<Integer> set=new HashSet<>();
        for(int i:b){
            set.add(i);
        }
        for(int i:a){
            int x=i+diff;
            if(set.contains(x)){
                return new int[]{i,x};
            }
            
        }
        return new int[]{};
    }
}