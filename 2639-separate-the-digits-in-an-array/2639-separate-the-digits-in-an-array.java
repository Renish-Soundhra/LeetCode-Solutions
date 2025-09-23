class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            ArrayList<Integer> arr=new ArrayList<>();
            while(i>0){
                int t=i%10;
                arr.add(t);
                i/=10;
            }
            Collections.reverse(arr);
            list.addAll(arr);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}