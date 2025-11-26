class Solution {
    public void duplicateZeros(int[] arr) {
        int nums[]=new int[arr.length];
        int i=0,j=0;
        while(i<arr.length && j<arr.length){
            if(arr[i]==0){
                j+=2;
            }
            else{
                nums[j]=arr[i];
                j++;
            }
            i++;
        }
        for(int n=0;n<arr.length;n++){
            arr[n]=nums[n];
        }
    }
}