class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(),m = t.length();
        if(n == 0)
        return true;
        if(m == 0)
        return false;
        int i=0,j;
        for(j=0;j<m;j++){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                if(i == n)
                break;
            }
        }
        return i == n;

    }
}