class Solution {
    public int maximumSwap(int num) {
        int number=num;
        int len=String.valueOf(num).length();
        int arr[]=new int[len];
        int k=len-1;
        while(num>0){
            arr[k]=num%10;
            num/=10;
            k--;
        }
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(arr[min]<=arr[j]){
                    min=j;
                }
            }
            if(arr[i]<arr[min]){
                int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                    break;
            }
        }
        if(tonum(arr)>number){
            return tonum(arr);
        }
        else{
            return number;
        }
    }
    private int tonum(int arr[]){
        int n=0;
        for(int i=0;i<arr.length;i++){
            n*=10;
            n+=arr[i];
        }
        return n;
    }
}