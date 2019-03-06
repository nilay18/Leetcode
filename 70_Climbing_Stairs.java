class Solution {
    public int climbStairs(int n) {
        if(n == 1)
        {
            return 1;
        }
        int start=1,end = 2;
        for(int i = 3;i<=n;i++)
        {
            int temp = start + end;
            start = end;
            end = temp;
        }
        return end;
    }
}