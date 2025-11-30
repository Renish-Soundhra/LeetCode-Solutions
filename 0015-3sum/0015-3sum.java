class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1,right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    list.add(arr);
                    right--;
                    left++;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return list;
    }
}