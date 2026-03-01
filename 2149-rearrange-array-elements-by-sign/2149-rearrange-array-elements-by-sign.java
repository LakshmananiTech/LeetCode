class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p[] = new int[nums.length/2];
        int n[] = new int[nums.length/2];
        int i=0,j=0;
        for(int k : nums)
        if(k > 0)
        p[i++] = k;
        else
        n[j++] = k;
        int ans[] = new int[nums.length];
        int a = 0,b = 0;
        for( i=0;i<nums.length;i++)
        if(i%2 == 0)
        ans[i] = p[a++];
        else
        ans[i] = n[b++];
        return ans;       
    }
}