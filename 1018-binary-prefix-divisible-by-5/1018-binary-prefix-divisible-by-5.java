class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list=new ArrayList<>();
        int prefix=0;
        for(int n:nums){
            prefix=(prefix*2+n)%5;
            list.add(prefix==0);
        }
        return list;
    }
}