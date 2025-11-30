class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
        for(int i=k+1;i<nums.length;i++){
            if(i>k+1 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1,right=nums.length-1;
            while(left<right){
                long sum=(long)nums[k]+nums[i]+nums[left]+nums[right];
                if(sum==target){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(nums[k]);
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
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        }
        return list;
    }
}