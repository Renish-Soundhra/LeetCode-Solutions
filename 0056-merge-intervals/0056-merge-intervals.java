class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(list.size()==0 || list.get(list.size()-1)[1]<intervals[i][0]){
                list.add(intervals[i]);
            }
            else{
                int last=list.size()-1;
                int end=Math.max(list.get(last)[1],intervals[i][1]);
                int arr[]=list.get(last);
                arr[1]=end;
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}