class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && start==-1){
                start=i;
            }
            else if(nums[i]==target){
                end=i;
            }
        }
        if(start!=-1 && end==-1){
            end=start;
        }
        int arr[]=new int[2];
        arr[0]=start;
        arr[1]=end;
        return arr;
    }
}