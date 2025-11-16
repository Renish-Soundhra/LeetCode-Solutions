class Solution {
    public String winningPlayer(int x, int y) {
        String ans="";
        int ctr=0;
        while(x>=1 && y>=4){
            x--;
            y-=4;
            ctr++;
        }
        if(ctr%2==0){
            ans="Bob";
        }
        else{
            ans="Alice";
        }
        return ans;
    }
}