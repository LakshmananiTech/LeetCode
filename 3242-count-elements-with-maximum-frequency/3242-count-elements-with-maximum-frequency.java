class Solution {
    public int maxFrequencyElements(int[] nums) {

        Map<Integer, Integer> hmap = new HashMap<>();
        for(Integer k: nums)
        hmap.put(k, hmap.getOrDefault(k,0)+1);
        java.util.Collection c = hmap.values();
        List<Integer> list = new ArrayList<>(c);
        int big = list.get(0);
        for(Integer k: list)
        if(k>big)
        big = k;
        int s = 0;
        for(Map.Entry<Integer, Integer> e: hmap.entrySet())
        {
            int k = e.getKey();
            int v = e.getValue();
            if(v == big)
            s+=v;
        
        }
        return s;
    }
}