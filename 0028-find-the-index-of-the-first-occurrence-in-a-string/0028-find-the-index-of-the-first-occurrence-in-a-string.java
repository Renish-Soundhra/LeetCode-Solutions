class Solution {
    public int strStr(String ha, String ne) {
        int i=0;
        int h=ha.length();
        int n=ne.length();
        for(int j=n;j<=h;j++){
            if(ha.substring(i,j).equals(ne)){
                return i;
            }
            i++;
        }
        return -1;
    }
}