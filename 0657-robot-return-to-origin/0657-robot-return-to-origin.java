class Solution {
    public boolean judgeCircle(String moves) {
        int num1=0;
        int num2=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                num1++;
            }
            else if(ch=='R'){
                num2++;
            }
            else if(ch=='L'){
                num2--;
            }
            else{
                num1--;
            }
        }
        if(num1==0 && num2==0){
            return true;
        }
        else{
            return false;
        }
    }
}