class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int i:nums2){
            set2.add(i);
        }
        HashSet<Integer> set3=new HashSet<>();
        for(int i:nums3){
            set3.add(i);
        }
        for(int i:set1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:set2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:set3){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)>=2){
                list.add(i);
            }
        }
        return list;
    }
}