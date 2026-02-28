class Solution {
    public int maxDistinct(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : s.toCharArray())
        map.merge(c,1,Integer::sum);
        
        return map.size();
        
    }
}