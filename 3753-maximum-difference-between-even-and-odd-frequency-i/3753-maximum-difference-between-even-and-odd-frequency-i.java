class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        for(Character k : s.toCharArray())
        map.merge(k,1,Integer::sum);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> e : map.entrySet())
        {   int k = e.getValue();
            if(k % 2 != 0 && k > max)
            max = k;
            if(k % 2 == 0 && k < min)
            min = k;
        }

        return max - min;
    }
}