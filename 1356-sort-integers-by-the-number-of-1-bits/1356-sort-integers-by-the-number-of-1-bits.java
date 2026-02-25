class Num implements Comparable<Num>
{
    int val;
    int setbits;
    public int compareTo(Num other)
    {
        if(this.setbits==other.setbits)
        {
            return this.val-other.val;
        }
        return this.setbits-other.setbits;
    }
}
class Solution {
    public int[] sortByBits(int[] arr) {
        List<Num> list=new ArrayList<>();
        for(int Num:arr)
        {
            Num numObj=new Num();
            numObj.val=Num;
            numObj.setbits=findsetbits(Num);
            list.add(numObj);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i).val;
        }
        return arr;
    }
    private int findsetbits(int n)
    {
        int setbits=0;
        while(n>0)
        {
            n&=(n-1);
            setbits++;
        }
        return setbits;
    }
}