class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int ctr=0;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=ch){
                ctr++;
                ch=s.charAt(i);
            }
        }
        return ctr;
    }
}