class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int i=0;
        int start=-1;
        int end=-1;
        int j=nums.length-1;
        while(i<nums.length){
            if(nums[i]!=arr[i]){
                start=i;
                break;
            }
            i++;
        }
        while(j>=0){
            if(nums[j]!=arr[j]){
                end=j;
                break;
            }
            j--;
        }
        return start==-1?0:end-start+1;
    }
}