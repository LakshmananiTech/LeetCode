class Solution {
    public String reverseByType(String s) {
        List<Character> alpa = new ArrayList<>();
        List<Character> sym = new ArrayList<>();
        for(Character k : s.toCharArray())
        if(k >= 97 && k <= 122)
        alpa.add(k);
        else 
        sym.add(k);
    
    Collections.reverse(alpa);
    Collections.reverse(sym);
    int i=0,j=0;
    String ans = "";
    for(char k : s.toCharArray())
    {
        if(k >= 97 && k <= 122)
        ans = ans + alpa.get(i++);
        else
        ans = ans + sym.get(j++);
    }
    return ans;
    }
}