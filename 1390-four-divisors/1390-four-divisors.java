class Solution {
    public int divisors(int n){
        int ctr=0;
        int sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ctr++;
                sum+=i;
                if(i!=n/i){
                    ctr++;
                    sum+=n/i;
                }
            }
        }
        if(ctr==4){
            return sum;
        }
        else{
            return 0;
        }
    }
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=divisors(nums[i]);
        }
        return ans;
    }
}