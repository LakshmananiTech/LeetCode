class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer k : nums)
        map.put(k,map.merge(k,1,Integer::sum));
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
           int k = e.getKey();
           int v = e.getValue();
            if(v == 2){
            res[0] = k;
            int n = nums.length;
            int s1 = n * (n+1) / 2;
            Set<Integer> set = new HashSet<>();
            for(int k1 : nums)
            set.add(k1);
            int s2 = 0;
            for(Integer k2 : set)
            s2 = s2 + k2;
            res[1] = s1 - s2;
            }
        }
        return res;
    }
}