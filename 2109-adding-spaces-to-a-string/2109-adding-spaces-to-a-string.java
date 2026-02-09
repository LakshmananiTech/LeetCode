class Solution {
    public String addSpaces(String s, int[] spaces) {
        char c[] = new char[s.length()+spaces.length];
        int j = 0;
        int k = 0;
        for(int i=0;i<s.length()+spaces.length;i++)
        {
            if( j < spaces.length && i == spaces[j]+j)
            {
                c[i] = ' ';
                j++;
            }
            else
            {
                c[i] = s.charAt(k);
                k++;
            }
        }
        return new String(c);
    }
}