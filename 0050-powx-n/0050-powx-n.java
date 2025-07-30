class Solution {
    double result = 1.0;
    public double myPow(double x, int n) {
        long N = n; 
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double currentProduct = x;
        if (N % 2 == 1) {
                result *= currentProduct;
            }
        currentProduct *= currentProduct;
        N /= 2;
        if(N>0){
            myPow(currentProduct,(int)N);
        }
        return result;
    }
}
