class Solution {
    public boolean prime(int n)
    {
        if(n == 2)
        return true;
        else if(n % 2 == 0 || n == 1)
        return false;
        else 
        {
            for(int i=3;i<=Math.sqrt(n);i += 2)
            if(n % i == 0)
            return false;
            return true;
        }
    }
    public boolean checkPrimeFrequency(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(Integer k : nums)
        map.merge(k, 1, Integer::sum);
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        if(prime(e.getValue()) == true)
        return true;
        return false;
    }
}