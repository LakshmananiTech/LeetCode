class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel = new HashMap<>();
        Map<Character,Integer> consonant = new HashMap<>();
        for(Character k : s.toCharArray())
        if(k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u')
        vowel.merge(k,1,Integer::sum);
        else
        consonant.merge(k,1,Integer::sum);
        int m1 = 0;
        if(vowel.values().stream().max((a,b) -> a.compareTo(b)).isPresent())
         m1 = vowel.values().stream().max((a,b) -> a.compareTo(b)).get();
        int m2 = 0;
        if(consonant.values().stream().max((a,b) -> a.compareTo(b)).isPresent())
         m2 = consonant.values().stream().max((a,b) -> a.compareTo(b)).get();
        return m1+m2;
    }

}