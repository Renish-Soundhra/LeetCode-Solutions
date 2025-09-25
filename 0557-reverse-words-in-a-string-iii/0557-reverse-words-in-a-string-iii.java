class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        StringBuilder ans=new StringBuilder();
        int i=0;
        for(String str:a){
            StringBuilder sb=new StringBuilder(str);
            sb.reverse().toString();
            ans.append(sb);
            if(i!=a.length-1){
                ans.append(" ");
            }
            i++;
        }
        return ans.toString();
    }
}