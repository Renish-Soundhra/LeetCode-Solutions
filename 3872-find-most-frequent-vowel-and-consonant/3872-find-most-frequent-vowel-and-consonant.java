class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxvow=0;
        int maxcon=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char n:map.keySet()){
            if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u'){
                maxvow=Math.max(maxvow,map.get(n));
            }
            else{
                maxcon=Math.max(maxcon,map.get(n));
            }
        }
        return maxcon+maxvow;
    }
}