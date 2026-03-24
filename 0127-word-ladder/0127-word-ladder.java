class Solution {
    private boolean calculatediff(String s,String t){
        int diff=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                diff++;
            }
        }
        return diff==1;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        set.add(beginWord);
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        int ctr=0;
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        while(!q.isEmpty()){
            ctr++;
            int size=q.size();
            for(int i=0;i<size;i++){
                String check=q.poll();
                if(check.equals(endWord)){
                    return ctr;
                }
                List<String> torem=new ArrayList<>();
                for(String str:set){
                    if(calculatediff(str,check)){
                        q.offer(str);;
                        torem.add(str);
                    }
                }
                for(int k=0;k<torem.size();k++){
                    set.remove(torem.get(k));
                }
            }
        }
        return 0;
    }
}