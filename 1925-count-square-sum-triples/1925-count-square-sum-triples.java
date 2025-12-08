class Solution {
    public int countTriples(int n) {
        int ctr=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    continue;
                }
                else{
                    int sum=(i*i)+(j*j);
                    int c=(int)Math.sqrt(sum);
                    if(c<=n && c*c==sum){
                        ctr++;
                    }
                }
            }
        }
        return ctr;
    }
}