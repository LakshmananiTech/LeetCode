class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Math.abs(nums[nums.length - 1] - nums[0]);
        for(int i=0;i<nums.length-1;i++)
        {
            int d = Math.abs(nums[i+1] - nums[i]);
            if(d > max)
            max = d;
        }
        return max;
    }
}