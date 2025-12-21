class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean present[]=new boolean[26];
        for(int i=0;i<allowed.length();i++){
            present[allowed.charAt(i)-'a']=true;
        }
        int ctr=0;
        for(String w:words){
            boolean good=true;
            for(int i=0;i<w.length();i++){
                if(!present[w.charAt(i)-'a']){
                    good=false;
                    break;
                }
            }
            if(good){
                ctr++;
            }
        }
        return ctr;
    }
}