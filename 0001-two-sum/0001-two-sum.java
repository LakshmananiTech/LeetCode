class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int j = 0;
        int ans[] = new int[2];
        for(int i=n-1;i>j;i--)
        {
                if(nums[i] + nums[j] == target)
                {
                        ans[0] = j;
                        ans[1] = i;
                        return ans;
                }
        
        if(i-1 == j)
        {
            j++;
            i = n;
        }
        
    }
    return ans;
    }
}