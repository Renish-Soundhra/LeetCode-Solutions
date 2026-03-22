class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ctr=0;
        int i=0;
        while(coins>0 && i<costs.length){
            if(costs[i]<=coins){
                coins-=costs[i];
                ctr++;
                i++;
            }
            else{
                break;
            }
        }
        return ctr;
    }
}