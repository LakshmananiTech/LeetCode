class Solution {
    public int countSegments(String s) {

        int c =0;
        for(String k : s.split(" "))
        if(k.trim().length() > 0)
        c++;
        return c;
        
    }
}