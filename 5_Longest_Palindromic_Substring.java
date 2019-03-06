class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        String max = "";
        for(int i = 0; i < s.length(); i++)
		{
            String s1 = extendPalindrome(s, i, i);			
			String s2 = extendPalindrome(s, i, i + 1);		

            if(s1.length() > max.length()) max = s1;
            if(s2.length() > max.length()) max = s2;
        }
        return max;
    }
    
    private String extendPalindrome(String s, int i, int j)
	{
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j))
		{
            i--;
			j++;
        }
        return s.substring(i + 1, j);
	}
}