class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int odd=0;
        int even=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='1' && j%2==0){
                even++;
            }
            else if(ch=='1'){
                odd++;
            }
            j++;
        }
        return new int[]{even,odd};
    }
}