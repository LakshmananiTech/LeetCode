class Solution {
    public int countQuadruplets(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-3;i++)
        for(int j=i+1;j<nums.length-2;j++)
        for(int k=j+1;k<nums.length-1;k++)
        for(int p=k+1;p<nums.length;p++)
        if(nums[i]+nums[j]+nums[k] == nums[p])
        c++;
        return c;
        
    }
}