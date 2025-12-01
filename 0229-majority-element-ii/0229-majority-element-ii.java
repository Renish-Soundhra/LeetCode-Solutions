class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ctr1=0;
        int ctr2=0;
        int el1=0;
        int el2=0;
        for(int i=0;i<nums.length;i++){
            if(ctr1==0 && nums[i]!=el2){
                el1=nums[i];
                ctr1++;
            }
            else if(ctr2==0 && nums[i]!=el1){
                el2=nums[i];
                ctr2++;
            }
            else if(nums[i]==el1){
                ctr1++;
            }
            else if(nums[i]==el2){
                ctr2++;
            }
            else{
                ctr1--;
                ctr2--;
            }
        }
        int num1=0;
        int num2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1){
                num1++;
            }
            else if(nums[i]==el2){
                num2++;
            }
        }
        List<Integer> list=new ArrayList<>();
        if(num1>(nums.length/3)){
            list.add(el1);
        }
        if(num2>(nums.length/3)){
            list.add(el2);
        }
        return list;
    }
}