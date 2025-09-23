class Solution {
    public boolean evensum(int n){
        int sum=0;
        while(n>0){
            int t=n%10;
            sum+=t;
            n/=10;
        }
        if(sum%2==0){
            return true;
        }
        return false;
    }
    public int countEven(int num) {
        int ctr=0;
        for(int i=1;i<=num;i++){
            if(evensum(i)){
                ctr++;
            }
        }
        return ctr;
    }
}