class Solution {
    public String largestOddNumber(String num) {
        int j=num.length()-1;
        while(j>=0){
            char ch=num.charAt(j);
            int n=ch-'0';
            if(n%2!=0){
                return num.substring(0,j+1);
            }
            j--;
        }
        return "";
    }
}