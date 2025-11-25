class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<dominoes.length;i++){
            int arr[]=dominoes[i];
            Arrays.sort(arr);
            String s=String.valueOf(arr[0])+String.valueOf(arr[1]);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int ans=0;
        for(String i:map.keySet()){
            if(map.get(i)>1){
                int n=map.get(i);
                ans+=(n*(n-1))/2;
            }
        }
        return ans;
    }
}