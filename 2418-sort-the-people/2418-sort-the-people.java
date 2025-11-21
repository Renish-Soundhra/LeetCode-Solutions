class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Integer h[]=new Integer[heights.length];
        for(int i=0;i<heights.length;i++){
            h[i]=heights[i];
        }
        Arrays.sort(h,Collections.reverseOrder());
        String arr[]=new String[names.length];
        int i=0;
        for(int n:h){
            arr[i]=map.get(n);
            i++;
        }
        return arr;
    }
}