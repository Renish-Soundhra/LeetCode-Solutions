class Solution {
    public int numTeams(int[] rating) {
        int ind=1;
        int count=0;
        while(ind<rating.length-1 && ind>0){
            int mt=rating[ind];
            int leftless=0;
            int leftmore=0;
            int rightless=0;
            int rightmore=0;
            for(int i=0;i<ind;i++){
                if(rating[i]<mt){
                    leftless++;
                }
                else{
                    leftmore++;
                }
            }
            for(int i=ind+1;i<rating.length;i++){
                if(rating[i]<mt){
                    rightless++;
                }
                else{
                    rightmore++;
                }
            }
            count+=(leftless*rightmore)+(leftmore*rightless);
            ind++;
        }
        return count;
    }
}