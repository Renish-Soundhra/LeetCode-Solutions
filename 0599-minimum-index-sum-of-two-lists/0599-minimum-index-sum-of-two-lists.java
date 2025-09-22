class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer,ArrayList<String>> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    map.computeIfAbsent(i+j,k->new ArrayList<>()).add(list1[i]);
                    min=Math.min(min,i+j);
                }
            }
        }
        return map.get(min).toArray(new String[0]);
    }
}