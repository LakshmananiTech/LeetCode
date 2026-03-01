class Solution {
    public int smallestIndex(int[] nums) {
        int i = 0;
        for(int k : nums)
        {
            int s = 0;
            while(k != 0)
            {
                int r = k % 10;
                s = s + r;
                k = k / 10;
            }
            if(i == s)
            return i;
            i++;
        }
        return -1;
    }
}