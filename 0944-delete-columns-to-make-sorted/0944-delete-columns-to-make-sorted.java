class Solution {
    public int minDeletionSize(String[] strs) {
        int ctr=0;
        int r=strs.length;
        int c=strs[0].length();
        for(int i=0;i<c;i++){
            for(int j=1;j<r;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    ctr++;
                    break;
                }
            }
        }
        return ctr;
    }
}