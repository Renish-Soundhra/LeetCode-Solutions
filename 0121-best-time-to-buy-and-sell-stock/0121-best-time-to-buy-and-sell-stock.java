class Solution {
    public int maxProfit(int[] prices) {
      int len=prices.length;
      int mindp[]=new int[len];
      int ansdp[]=new int[len];
      mindp[0]=prices[0];
      for(int i=1;i<len;i++){
        mindp[i]=Math.min(mindp[i-1],prices[i]);
      }
      for(int i=1;i<len;i++){
        ansdp[i]=Math.max(ansdp[i-1],prices[i]-mindp[i]);
      }
      return ansdp[len-1];
    }
}