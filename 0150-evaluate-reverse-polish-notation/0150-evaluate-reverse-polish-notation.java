class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")){
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                if(str.equals("+")){
                    stack.push(String.valueOf(num1+num2));
                }
                else if(str.equals("-")){
                    stack.push(String.valueOf(num1-num2));
                }
                else if(str.equals("*")){
                    stack.push(String.valueOf(num1*num2));
                }
                else{
                    stack.push(String.valueOf(num1/num2));
                }
            }
            else{
                stack.push(str);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}