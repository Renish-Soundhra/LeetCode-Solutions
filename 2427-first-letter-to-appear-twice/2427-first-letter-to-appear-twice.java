class Solution {
    public char repeatedCharacter(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            freq[ch]++;
            if(freq[ch]==2){
                return s.charAt(i);
            }
        }
        return '0';
    }
}