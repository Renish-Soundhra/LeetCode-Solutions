class Solution {
    public String[] findWords(String[] words) {
        List<String> list=new ArrayList<>();
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        for(String word:words){
            int ctr=0;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                String s=String.valueOf(ch).toLowerCase();
                if(s1.contains(s)){
                    ctr+=0;
                }
                else if(s2.contains(s)){
                    ctr++;
                }
                else{
                    ctr+=10;
                }
            }
            if(ctr==0 || ctr==word.length() || ctr==10*word.length()){
                list.add(word);
            }
        }
        String arr[]=new String[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}