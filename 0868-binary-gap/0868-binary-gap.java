class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int max=0;
        int first=-1;
        int last=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                if(first==-1){
                    first=i;
                }
                else{
                    last=i;
                }
                if(first!=-1 && last!=-1){
                    max=Math.max(max,last-first);
                    first=last;
                    last=0;
                }
            }
        }
        return max;
    }
}