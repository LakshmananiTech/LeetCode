class Solution {
    public int maximizeSum(int[] nums, int k) {
        int m = Arrays.stream(nums).max().getAsInt();
        int s = 0;
        for(int i=1;i<k;i++){
        
        s = s + m;
        m++;
        }
        s = s + m;
        return s;
    }
}