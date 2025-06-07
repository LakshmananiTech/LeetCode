class NumArray {
    int a[];
    public NumArray(int[] nums) {
        a = nums;
    }
    
    public int sumRange(int i, int j) {
        int s = 0;
        for(int k = i;k<=j;k++)
            s = s + a[k];
        return s;
 
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */