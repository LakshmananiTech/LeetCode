class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for(Integer t : nums)
        map.merge(t,1,Integer::sum);
        int s = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        if(e.getValue() % k == 0)
        s = s + (e.getKey() * e.getValue());
        return s;

        
    }
}