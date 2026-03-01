class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
      
        int k = 0;
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {   
            double average = (nums[i] + nums[j])/2.0;
            if(average < min)
            min = average;
        }
        return min;
    }
}