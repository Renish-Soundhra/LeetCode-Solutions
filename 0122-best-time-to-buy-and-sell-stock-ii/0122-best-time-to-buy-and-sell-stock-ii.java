class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=0;
        int prof=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                prof+=prices[i]-buy;
            }
            buy=prices[i];
        }
        return prof;
    }
}