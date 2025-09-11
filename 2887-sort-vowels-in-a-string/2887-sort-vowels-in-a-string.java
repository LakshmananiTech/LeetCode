class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(Character k : s.toCharArray())
        {
            char c = Character.toLowerCase(k);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            list.add(k);
        }
        list.sort(Comparator.naturalOrder());
        char b[] = new char[s.length()];
        int i=0,j=0;
        for(char s1 : s.toCharArray())
        {
            char c = Character.toLowerCase(s1);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
            b[i++] =   list.get(j++);
            else
            b[i++] = s1;
        }
        return new String(b);
    }
}