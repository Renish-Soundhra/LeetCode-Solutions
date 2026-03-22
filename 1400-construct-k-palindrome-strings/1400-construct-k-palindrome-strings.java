class Solution {
    public boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int odd=0;
        for(int n:map.values()){
            if(n%2!=0){
                odd++;
            }
        }
        return odd<=k && k<=s.length();
    }
}