class Solution {
    List<String> out = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        char[] temp = new char[2*n];
        return generateList(temp,0,n,n);        
    }
    
    public List<String> generateList(char[] temp,int index,int l,int r)
    {
        if(r==0)
        {
            out.add(new String(temp));
        }
        if(l>0)
        {
            temp[index] ='(';
            generateList(temp,index+1,l-1,r);
        }
        if(r>l)
        {
            temp[index] =')';
            generateList(temp,index+1,l,r-1);
        }
        return out;
    }
}