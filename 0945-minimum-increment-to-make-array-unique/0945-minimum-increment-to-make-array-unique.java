class Solution {
    public int minIncrementForUnique(int[] nums) {
        Set<Integer> set = new HashSet();
        int s = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(Integer k : nums)
        set.add(k);
        if(n == set.size())
        return 0;
        if(n == 1)
        return 0;
        for(int i=0;i<n-1;i++)
        if(nums[i+1] <= nums[i])
        {
        s = s + Math.abs(nums[i]+1 - nums[i+1]);
        nums[i+1] = nums[i] + 1;
        }
        return s;

        
    }
}