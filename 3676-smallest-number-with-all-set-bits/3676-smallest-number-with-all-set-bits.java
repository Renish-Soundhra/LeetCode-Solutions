class Solution {
    public int smallestNumber(int n) {
        int i=0;
        int ans=0;
        while(true){
            if((int)(Math.pow(2,i))-1>=n){
                ans=(int)(Math.pow(2,i))-1;
                break;
            }
            i++;
        }
        return ans;
    }
}