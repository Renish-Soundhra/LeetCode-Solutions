class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}