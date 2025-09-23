class Solution {
    public boolean palindrome(String s){
        int size=s.length();
        int i=0,j=size-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(palindrome(s)){
                return s;
            }
        }
        return "";
    }
}