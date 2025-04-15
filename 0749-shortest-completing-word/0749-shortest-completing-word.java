class Solution {
    Map<Character,Integer> createMap(String s)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : s.toLowerCase().toCharArray())
        if(Character.isAlphabetic(c))
        map.merge(c,1,Integer::sum);
        return map;
    }
    boolean compareMap(Map<Character,Integer> m1,Map<Character,Integer> m2)
    {
    
        for(Map.Entry<Character,Integer> e : m1.entrySet())
        {
            Character k1 = e.getKey();
            int v1 = e.getValue();
            int v2 = m2.getOrDefault(k1,0);
            if(v1 > v2)
            return false;
        }
        return true;
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
       Map<Character,Integer> m1 = createMap(licensePlate);
       Map<Character,Integer> m2 = null;
       int i=0;
       int min = 15;
       String small = " ";
       for(String k : words)
       {
       m2 = createMap(k);
       System.out.println(m2);
       if(compareMap(m1,m2))
       if(k.length() < min)
       {
        System.out.println(k);
        min = k.length();
        small = k;
       }
        m2.clear();
       }
    return small;
    }
}