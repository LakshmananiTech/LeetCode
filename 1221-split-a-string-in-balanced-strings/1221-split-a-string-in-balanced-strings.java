class Solution {
    public int balancedStringSplit(String s) {
        int cr=0;
        int cl=0;
        
        int cans=0;
        int n = s.length();
        for(char k : s.toCharArray())
        {
            if(k == 'L')
            cl++;
            else
            cr++;
            if(cl != 0 && cr != 0 && cl == cr)
            {
                cans++;
                cr = 0;
                cl = 0;
            }
        }
        return cans;
    }
}