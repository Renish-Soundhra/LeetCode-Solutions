class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean odd=false;
        int sum=0;
        for(int i:map.values()){
            if(i%2!=0){
                if(!odd){
                    sum+=i;
                    odd=true;
                }
                else{
                    sum+=i-1;
                }
            }
            else{
                sum+=i;
            }
        }
        return sum;
    }
}