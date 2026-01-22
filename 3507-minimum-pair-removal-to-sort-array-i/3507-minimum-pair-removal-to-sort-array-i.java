class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);
        
        int operations = 0;
        
        while (!isNonDecreasing(list)) {
            int n = list.size();
            int minSum = Integer.MAX_VALUE;
            int idx = -1;
            
            for (int i = 0; i < n - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }
            
            list.set(idx, minSum);
            list.remove(idx + 1);
            operations++;
        }
        
        return operations;
    }
    
    private boolean isNonDecreasing(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) return false;
        }
        return true;
    }
}
