class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        for(int k : nums)
        list.add(index[i++],k);
        int ans[] = new int[list.size()];
        i=0;
        for(int k : list)
        ans[i++] = k;
        return ans;


    }
}