class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<a.length;i++){
            boolean destruct=false;
            while(!stack.isEmpty() && a[i]<0 && stack.peek()>0){
                if(stack.peek()<-a[i]){
                    stack.pop();
                    continue;
                }
                else if(stack.peek()==-a[i]){
                    stack.pop();
                }
                destruct=true;
                break;
            }
            if(!destruct){
                stack.push(a[i]);
            }
        }
        int arr[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        return arr;
    }
}