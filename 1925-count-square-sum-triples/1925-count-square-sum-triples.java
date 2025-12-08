class Solution {
    public int countTriples(int n) {
        int ctr=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    continue;
                }
                else{
                    for(int k=1;k<=n;k++){
                        if(j==k){
                            continue;
                        }
                        else{
                            if((i*i)+(j*j)==(k*k)){
                                ctr++;
                            }
                        }
                    }
                }
            }
        }
        return ctr;
    }
}