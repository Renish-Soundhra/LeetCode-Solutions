class Solution {
    public int[] decimalRepresentation(int n) {
        int ctr=0;
        int num=n;
        while(num>0){
            if(num%10!=0){
                ctr++;
            }
            num/=10;
        }
        int arr[]=new int[ctr];
        int mul=1;
        while(n>0){
            int temp=n%10;
            if(temp!=0){
                arr[ctr-1]=temp*mul;
                ctr--;
            }
            mul*=10;
            n/=10;
        }
        return arr;
    }
}