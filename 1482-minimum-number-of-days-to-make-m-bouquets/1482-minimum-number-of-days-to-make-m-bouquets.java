class Solution {
    public boolean calculate(int[] arr,int n,int m,int k){
        int ctr=0;
        int b=0;
        for(int a:arr){
            if(n>=a){
                ctr++;
            }
            else{
                ctr=0;
            }
            if(ctr==k){
                b++;
                ctr=0;
            }
        }
        return b>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long num=(long)m*k;
        if(num>bloomDay.length){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int low=min;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(calculate(bloomDay,mid,m,k)){
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