class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int arr[]=new int[friends.length];
        int n=0;
        for(int i=0;i<order.length;i++){
            int ans=0;
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans=order[i];
                    break;
                }
            }
            if(ans!=0){
                arr[n]=ans;
                n++;
            }
        }
        return arr;
    }
}