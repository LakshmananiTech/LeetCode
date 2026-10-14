class Solution {
    public int minOperations(int[] nums) {
        int s = 0;
        for(int i=0;i<nums.length- 1;i++)
        {
            if(nums[i+1] <= nums[i])
            {
            s = s + nums[i]+1 - nums[i+1];
            nums[i+1] = nums[i] + 1;
            }
        }
        return s;
    }
}