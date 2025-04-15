class Solution {
    public int differenceOfSum(int[] nums) {
        int s1 = Arrays.stream(nums).sum();
        int s2=0;
        for(int k : nums)
        {
            if(k < 10)
            s2 = s2 + k;
            else
            {
                while(k != 0)
                {
                    s2 = s2 + k % 10;
                    k /= 10;
                }
            }
        }
        return Math.abs(s1 - s2);
    }
}