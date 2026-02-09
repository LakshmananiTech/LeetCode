class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int se = 0;
        int so = 0;
        for(int i=0;i<n;i++)
        if(i%2 == 0)
        se = se + nums[i];
        else
        so = so + nums[i];
        return se - so;
        
    }
}