class Solution {
    int reverse(int n)
    {
        int s = 0;
        while(n != 0)
        {
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        return s;
    }
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=n-1;i>=0;i--)
        {   
    
                int rev = reverse(nums[i]);
                if(map.containsKey(rev))
                {
                    if(map.get(rev)-i < min)
                    min = map.get(rev) - i;
                }
                map.put(nums[i],i);
                
            

        }
        if(min == Integer.MAX_VALUE)
        return -1;
        
        return min;
    }
}