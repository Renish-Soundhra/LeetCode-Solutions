class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size=nums.length;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            int ctr=0;
            for(int j=0;j<size;j++){
                if(nums[j]<nums[i]){
                    ctr++;
                }
            }
            arr[i]=ctr;
        }
        return arr;
    }
}