class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(c=='(') sta.push(')');
            else if(c=='{') sta.push('}');
            else if(c=='[') sta.push(']');
            else if(sta.isEmpty() || sta.pop()!=c) return false;
        }
        return sta.isEmpty();
    }
}