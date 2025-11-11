class Solution {
    public int minBitFlips(int start, int goal) {
        int num=start^goal;
        int ctr=0;
        for(int i=0;i<31;i++){
            if((num&(1<<i))!=0){
                ctr++;
            }
        }
        return ctr;
    }
}