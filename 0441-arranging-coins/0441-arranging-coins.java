class Solution {
    public int arrangeCoins(int n) {
        int ctr=0;
        int num=1;
        while(n-num>=0){
            n=n-num;
            ctr++;
            num++;
        }
        return ctr;
    }
}