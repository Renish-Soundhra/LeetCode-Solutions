class Solution {
    HashSet<List<Integer>> set=new HashSet<>();
    private void subset(int nums[],int i,List<Integer> list){
        if(i==nums.length){
            List<Integer> temp=new ArrayList<>(list);
            Collections.sort(temp);
            set.add(temp);
            return;
        }
        list.add(nums[i]);
        subset(nums,i+1,list);
        list.remove(list.size()-1);
        subset(nums,i+1,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        subset(nums,0,new ArrayList<>());
        List<List<Integer>> res=new ArrayList<>();
        for(List<Integer> i:set){
            res.add(new ArrayList<>(i));
        }
        return res;
    }
}