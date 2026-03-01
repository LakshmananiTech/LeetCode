class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack();
        for(Character k : s.toCharArray())
        if(!Character.isDigit(k))
        st.push(k);
        else
        st.pop();
        if(st.isEmpty())
        return "";
        String p = "";
        for(Character k : st)
        p = p + k;
        return p;

        
    }
}