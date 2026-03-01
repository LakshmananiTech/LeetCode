class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        for(String k : word1)
        s1 = s1 + k;
        String s2="";
        for(String k : word2)
        s2 = s2+k;
        return s1.equals(s2);
    }
}