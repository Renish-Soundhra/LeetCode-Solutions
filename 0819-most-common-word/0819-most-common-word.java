class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            String s=banned[i].toLowerCase();
            set.add(s);
        }
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", " ");
        String[] arr = paragraph.split("\\s+");
        String ans="";
        int max=0;
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            s=s.toLowerCase();
            if(!set.contains(s)){
                map.put(s,map.getOrDefault(s,0)+1);
                max=Math.max(max,map.get(s));
            }
        }
        for(String n:map.keySet()){
            int num=map.get(n);
            if(num==max){
                ans=n;
            }
        }
        return ans;
    }
}