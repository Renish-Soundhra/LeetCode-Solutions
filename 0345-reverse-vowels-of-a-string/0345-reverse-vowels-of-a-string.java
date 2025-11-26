class Solution {
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                list.add(ch);
            }
        }
        Collections.reverse(list);
        String ans="";
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                ans+=list.get(j);
                j++;
            }
            else{
                ans+=ch;
            }
        }
        return ans;
    }
}