class Solution {
    public int nextGreaterElement(int n) {
        List<Integer> nm=new ArrayList<>();
        String k=String.valueOf(n);
        for(int i=0;i<k.length();i++)
        {
            nm.add(k.charAt(i)-'0');
        }
        int i=nm.size()-1;
        while(i>0 && nm.get(i) <= nm.get(i-1))
        {
            i--;
        }
        if(i==0)
            return -1;
        i--;
        int j=nm.size()-1;
        while(nm.get(j) <= nm.get(i))
        {
            j--;
        }
        swap(nm,i,j);
        task(nm,i+1);
        k="";
        for(int ii=0;ii<nm.size();ii++)
        {
            k+=nm.get(ii);
        }
        if(Long.parseLong(k)>Integer.MAX_VALUE)
            return -1;
        else
            return Integer.parseInt(k);
    }
    public void swap(List<Integer> nm, int i, int j)
    {
        int d=nm.get(i);
        nm.add(i,nm.get(j));
        nm.remove(i+1);
        nm.add(j,d);
        nm.remove(j+1);
    }
    public void task(List<Integer> nm, int i)
    {
        int k=nm.size()-1;
        for(int j=i;j<k;j++)
        {
            swap(nm,j,k);
            k--;
        }
    
}