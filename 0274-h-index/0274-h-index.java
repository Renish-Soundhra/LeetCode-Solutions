class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); 
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int papers = n - i; 
            h = Math.max(h, Math.min(citations[i], papers));
        }
        return h;
    }
}