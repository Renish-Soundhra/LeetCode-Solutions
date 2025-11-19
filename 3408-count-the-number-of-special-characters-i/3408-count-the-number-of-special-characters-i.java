class Solution {
    public int numberOfSpecialChars(String word) {
        int ctr=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int n:map.keySet()){
            if(map.getOrDefault((char)(n-32),0)!=0){
                ctr++;
            }
        }
        return ctr;
    }
}