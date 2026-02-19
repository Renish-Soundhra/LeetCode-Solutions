class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length < 3)
            return 0;
        int ans = 0;
        int si =0; 
        int i = si+1; 
        while(i<arr.length){
            if(arr[i] <= arr[i-1]){
                si=i;
                i++;
                continue;
            }
            while(i<arr.length && arr[i] > arr[i-1]){
                i++;
            }

            if(i==arr.length || arr[i] == arr[i-1])
                continue;        

            while(i<arr.length && arr[i] < arr[i-1])
                i++;
            ans = Math.max(i-si, ans);
            si=i-1;
        }

        return ans;
    }
}