class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int max=0;
        Arrays.sort(tokens);
        int low=0;
        int high=tokens.length-1;
        while(low<=high){
            if(power>=tokens[low]){
                power-=tokens[low];
                score++;
                low++;
                max=Math.max(max,score);
            }
            else if(score>0){
                power+=tokens[high];
                score--;
                high--;
            }
            else{
                break;
            }
        }
        return max;
    }
}