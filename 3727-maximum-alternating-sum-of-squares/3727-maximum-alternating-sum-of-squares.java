class Solution {
    public long maxAlternatingSum(int[] nums) {

        int a[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        a[i] = Math.abs(nums[i]);
        Arrays.sort(a);
        long s = 0;
        int j=nums.length-1,k=0;
        
        for(int i = 0;i<nums.length;i++)
        {
        if(i%2 == 0)
        
        s = s + (int)Math.pow(a[j--],2);
        else
        s = s - (int) Math.pow(a[k++],2);
            if(k > nums.length/2)
            break;
        }
        return s;

        
    }
}