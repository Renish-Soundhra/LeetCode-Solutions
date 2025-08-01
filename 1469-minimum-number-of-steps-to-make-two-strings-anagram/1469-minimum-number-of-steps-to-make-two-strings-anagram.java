class Solution {
    public int minSteps(String s, String t) {
        int total=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map1.getOrDefault(s.charAt(i),0)>map2.getOrDefault(s.charAt(i),0)){
                total+=Math.abs((map1.getOrDefault(s.charAt(i),0)-map2.getOrDefault(s.charAt(i),0)));
                map1.remove(s.charAt(i));
                map2.remove(s.charAt(i));
            }
        }
        return total;
    }
}