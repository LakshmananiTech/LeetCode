class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i=0;i<nums.length-1;i+=2)
        for(int j=i+2;j<nums.length;j+=2)
        if(nums[i] > nums[j])
        {
            int c = nums[i];
            nums[i] = nums[j];
            nums[j] = c;
        }

        for(int i=1;i<nums.length-1;i+=2)
        for(int j=i+2;j<nums.length;j+=2)
        if(nums[i] < nums[j])
        {
            int c = nums[i];
            nums[i] = nums[j];
            nums[j] = c;
        }
      
      return nums;  
    }
}