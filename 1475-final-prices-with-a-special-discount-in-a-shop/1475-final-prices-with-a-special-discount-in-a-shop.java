class Solution {
    public int[] finalPrices(int[] prices) {
        int i=0;
        int j=1;
        while(j<prices.length){
            while(j<prices.length && prices[j]>prices[i]){
                j++;
            }
            if(j!=prices.length){
                prices[i]=prices[i]-prices[j];
            }
            i++;
            j=i+1;
        }
        return prices;
    }
}