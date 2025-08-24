class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,max=0,zctr=0;
        List<Integer> list=new ArrayList<>();
        while(j<nums.length){
            if(nums[j]==0){
                zctr++;
                list.add(j);
                if(zctr>k){
                    i=list.get(0)+1;
                    list.remove(0);
                }
            }
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}