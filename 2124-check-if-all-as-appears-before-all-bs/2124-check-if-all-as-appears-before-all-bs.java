class Solution {
    public boolean checkString(String s) {
        int n = s.lastIndexOf("a");
        int m = s.indexOf("b");
        if(m < n && m != -1 && n != -1)
        return false;
        return true;
        
    }
}