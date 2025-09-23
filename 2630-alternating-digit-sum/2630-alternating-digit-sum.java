class Solution {
    public int alternateDigitSum(int n) {
        int ctr=0;
        int time=0;
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        sb.reverse();
        n=Integer.parseInt(sb.toString());
        while(n>0){
            int t=n%10;
            if(time%2==0){
                ctr+=t;
            }
            else{
                ctr-=t;
            }
            time++;
            n/=10;
        }
        return ctr;
    }
}