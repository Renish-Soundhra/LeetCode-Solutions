class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxodd=0;
        int mineven=Integer.MAX_VALUE;
        for(int i:map.values()){
            if(i%2!=0){
                maxodd=Math.max(maxodd,i);
            }
            else{
                mineven=Math.min(mineven,i);
            }
        }
        int dif=maxodd-mineven;
        return dif;
    }
}