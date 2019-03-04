class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length(), ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0,j=0;i<size;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                j = Math.max(map.get(s.charAt(i)),j);
            }
            ans = Math.max(ans,i-j+1);
            map.put(s.charAt(i),i+1);
        }   
        return ans;
    }
}