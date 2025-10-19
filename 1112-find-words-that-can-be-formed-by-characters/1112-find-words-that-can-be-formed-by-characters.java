class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[]=new int[26];
        int ans=0;
        for(int i=0;i<chars.length();i++){
            arr[chars.charAt(i)-'a']++;
        }
        for(String word:words){
            int ctr=0;
            int freq[]=Arrays.copyOf(arr,arr.length);
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(freq[ch-'a']!=0){
                    ctr++;
                    freq[ch-'a']--;
                }
                else{
                    break;
                }
                if(ctr==word.length()){
                    ans+=ctr;
                }
            }
        }
        return ans;
    }
}