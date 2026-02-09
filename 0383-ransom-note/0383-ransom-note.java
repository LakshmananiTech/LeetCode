class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> mapran = new TreeMap<>();
            for(Character k : ransomNote.toCharArray())
            mapran.merge(k,1,Integer::sum);
            Set<Character> set = new TreeSet<>();
            for(Character k : ransomNote.toCharArray())
            set.add(k);
            Map<Character, Integer> mapmag = new TreeMap<>();
            for(Character k : magazine.toCharArray())
                if(set.contains(k))
                    mapmag.merge(k,1,Integer::sum);
            
            for(Character k : set)
            if(mapmag.getOrDefault(k,0) < mapran.get(k))
            return false;
            return true;

            }
}