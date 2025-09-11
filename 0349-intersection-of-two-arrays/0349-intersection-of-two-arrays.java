class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    set.add(nums1[i]);
                }
            }
        }
        int ind=0;
        int arr[]=new int[set.size()];
        for(int n:set){
            arr[ind]=n;
            ind++;
        }
        return arr;
    }
}