class Solution {
    public int reverse(int x) {
        if(x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return 0;
        int res = 0;
        int n = Math.abs(x);
        while(n != 0){
            int digit = n % 10;
            n = n/10;
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && digit >7) ) return 0;
            res = res*10 + digit;
            
        }
        return x > 0? res: -1*res;
    }
}