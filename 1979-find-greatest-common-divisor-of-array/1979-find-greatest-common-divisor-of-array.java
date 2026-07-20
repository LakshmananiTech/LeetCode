class Solution {
    public int findGCD(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        for(int k : nums)
        {
            if(k < a)
            a = k;
            if(k > b)
            b = k;
        }
        while(b != 0)
        {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
        
    }
}