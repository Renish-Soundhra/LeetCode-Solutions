class Solution {
    public int calculate(int n,int[] arr){
        int total=0;
        for(int i:arr){
            total+=Math.ceil((double)i/n);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int hours=calculate(mid,piles);
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}