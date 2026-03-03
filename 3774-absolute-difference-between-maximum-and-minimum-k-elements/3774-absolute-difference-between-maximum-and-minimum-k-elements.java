class Solution {
    public int absDifference(int[] nums, int k) {
        if(nums.length == 1)
        return 0;
        Arrays.sort(nums);
        int s1 = 0;
        int s2 = 0;
        int p = nums.length-1;
        int q = 0;
        for(int i=1;i<=k;i++)
        {
            s1 = s1 + nums[p--];
            s2 = s2 + nums[q++];
        }
        return s1 - s2;
    }
}