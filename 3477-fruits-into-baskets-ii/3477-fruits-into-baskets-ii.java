class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ctr=0;
        for(int i=0;i<fruits.length;i++){
            int fruit=fruits[i];
            for(int j=0;j<fruits.length;j++){
                int basket=baskets[j];
                if(fruit<=basket){
                    baskets[j]=-1;
                    break;
                }
            }
        }
        for(int n:baskets){
            if(n!=-1){
                ctr++;
            }
        }
        return ctr;
    }
}