class Solution {
    HashSet<Long> seen=new HashSet<>();
    public long digsum(long n){
        long sum=0;
        while(n>0){
            int ones=(int)(n%10);
            sum+=ones*ones;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(long n) {
        if(n==1){
            return true;
        }
        else if(seen.contains(n)){
            return false;
        }
        seen.add(n);
        long sum=digsum(n);
        return isHappy(sum);
    }
}