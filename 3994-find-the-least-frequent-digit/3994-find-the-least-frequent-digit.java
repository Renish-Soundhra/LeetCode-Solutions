class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n>0){
            int temp=n%10;
            map.put(temp,map.getOrDefault(temp,0)+1);
            n/=10;
        }
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i:map.keySet()){
            if(min>map.get(i)){
                min=map.get(i);
                ans=i;
            }
        }
        return ans;
    }
}