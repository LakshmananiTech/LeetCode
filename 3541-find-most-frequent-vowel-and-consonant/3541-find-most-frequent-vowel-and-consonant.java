class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowels = new HashMap<>();
        Map<Character, Integer> consonants = new HashMap<>();
        for(Character c : s.toCharArray())
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        vowels.merge(c,1,Integer::sum);
        else
        consonants.merge(c,1,Integer::sum);
        int sv = 0;
        int sc = 0;
        for(Map.Entry<Character,Integer> e : vowels.entrySet())
        if(e.getValue() > sv)
        sv = e.getValue();

        for(Map.Entry<Character,Integer> e : consonants.entrySet())
        if(e.getValue() > sc)
        sc = e.getValue();
        return sv + sc;
    }
}