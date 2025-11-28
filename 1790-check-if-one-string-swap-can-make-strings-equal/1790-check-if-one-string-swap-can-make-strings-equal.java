class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int ctr=0;
        int ind1=-1;
        int ind2=-1;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            char sh=s2.charAt(i);
            if(ch!=sh && ind1==-1){
                ind1=i;
                ctr++;
            }
            else if(ch!=sh){
                ind2=i;
                ctr++;
            }
            if(ctr>2){
                return false;
            }
        }
        if(ind2!=-1 && s1.charAt(ind1)==s2.charAt(ind2) && s1.charAt(ind2)==s2.charAt(ind1)){
            return true;
        }
        return false;
    }
}