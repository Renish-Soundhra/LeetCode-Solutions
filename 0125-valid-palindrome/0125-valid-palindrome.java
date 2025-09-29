class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
                sb1.append(ch);
            }
        }
        if(s.equals(" ")){
            return true;
        }
        return sb1.reverse().toString().equals(sb.toString());
    }
}