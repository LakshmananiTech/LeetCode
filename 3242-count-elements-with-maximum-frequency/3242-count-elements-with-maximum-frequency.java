class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int k : nums)
        map.merge(k,1,Integer::sum);


        java.util.Collection<Integer> list1 = map.values();
        int max = list1.stream().max((a,b) -> a.compareTo(b)).get();
        long c = list1.stream().filter(k -> k == max).count();        
        return (int) c * max;
        
    }
}