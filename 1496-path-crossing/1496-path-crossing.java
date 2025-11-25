class Solution {
    public boolean isPathCrossing(String path) {
        HashMap<String,Integer> map=new HashMap<>();
        int arr[]=new int[]{0,0};
        map.put("0,0",1);
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='E'){
                arr[0]++;
            }
            else if(ch=='W'){
                arr[0]--;
            }
            else if(ch=='N'){
                arr[1]++;
            }
            else{
                arr[1]--;
            }
            String s=String.valueOf(arr[0])+","+String.valueOf(arr[1]);
            if(map.containsKey(s)){
                return true;
            }
            else{
                map.put(s,1);
            }
        }
        return false;
    }
}