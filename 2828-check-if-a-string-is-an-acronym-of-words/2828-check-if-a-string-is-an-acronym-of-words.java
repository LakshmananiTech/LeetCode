class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int l1 = s.length();
        int l2 = words.size();
        if(l1 != l2)
          return false;
          int i=0;
        for(String k : words)
        if(s.charAt(i) != k.charAt(0))
          return false;
        else
           i++;
        return true;
        
    }
}