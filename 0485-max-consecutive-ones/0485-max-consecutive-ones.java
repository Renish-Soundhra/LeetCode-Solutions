class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen=0;
     int curlen=0;
     for(int n:nums){
        if(n==1){
            curlen++;
        }
        else{
            curlen=0;
        }
       if(maxlen>curlen){
        maxlen=maxlen;
       }
       else{
        maxlen=curlen;
       }
     }
     return maxlen;

    }
}