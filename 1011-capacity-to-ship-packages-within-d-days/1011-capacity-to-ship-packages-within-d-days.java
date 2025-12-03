class Solution {
    public int calculate(int n,int[] arr){
        int day=1;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(sum>n){
                sum=i;
                day++;
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(calculate(mid,weights)<=days){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}