class Solution {
    public int lengthOfLastWord(String s) {
        String l[] = s.split(" ");
        return l[l.length-1].length();

        
    }
}