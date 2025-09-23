class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ctr=0;
        for(int i:hours){
            if(i>=target){
                ctr++;
            }
        }
        return ctr;
    }
}