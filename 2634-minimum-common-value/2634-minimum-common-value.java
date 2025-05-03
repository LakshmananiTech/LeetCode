class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();

        Map<Integer,Integer> map = new TreeMap<>();
        for(int k : nums1)
        s1.add(k);
        for(int k : s1)
        map.merge(k,1,Integer::sum);
        for(int k : nums2)
        s2.add(k);
        for(int k : s2)
        map.merge(k,1,Integer::sum);
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            int k = e.getKey();
            int v = e.getValue();
            if(v > 1)
            return k;
        }
        return -1;
    }
}