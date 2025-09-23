class Solution {
    public int countDigits(int num) {
        int ctr=0;
        int val=num;
        while(val>0){
            int n=val%10;
            if(num%n==0){
                ctr++;
            }
            val/=10;
        }
        return ctr;
    }
}