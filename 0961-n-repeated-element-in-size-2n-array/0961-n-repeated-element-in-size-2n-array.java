class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer k : nums)
        map.merge(k,1,Integer::sum);
        int n = nums.length/2;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        if(e.getValue() == n)
        return e.getKey();
        return 0;
    }
}