class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list=new ArrayList<>();
        for(String str:operations){
            if(str.equals("C")){
                list.remove(list.size()-1);
            }
            else if(str.equals("D")){
                int num=list.get(list.size()-1);
                num*=2;
                list.add(num);
            }
            else if(str.equals("+")){
                int num=list.get(list.size()-1);
                int num2=list.get(list.size()-2);
                list.add(num+num2);
            }
            else{
                list.add(Integer.valueOf(str));
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}