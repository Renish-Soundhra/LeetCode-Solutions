class Solution {
    public double average(int[] salary) {
        int min=salary[0];
        int max=salary[0];
        int sum=0;
        int ctr=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>=max){
                max=salary[i];
            }
            if(salary[i]<=min){
                min=salary[i];
            }
        }
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=max && salary[i]!=min){
                sum+=salary[i];
                ctr++;
            }
        }
        return (double)sum/ctr;
    }
}