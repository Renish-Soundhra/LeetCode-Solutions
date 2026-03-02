class Solution {
    public int trap(int[] height) {
        int maxwater=0;
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftmax=height[0];
        int rightmax=height[n-1];
        while(left<right)
        {
            leftmax=Math.max(leftmax,height[left]);
            rightmax=Math.max(rightmax,height[right]);
            if(leftmax<rightmax)
            {
                maxwater+=leftmax-height[left];
                left++;
            }
            else
            {
                maxwater+=rightmax-height[right];
                right--;
            }
        }
        return maxwater;
    }
}