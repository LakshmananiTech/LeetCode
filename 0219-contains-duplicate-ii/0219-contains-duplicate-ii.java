class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(Integer b : nums)
        list.add(b);
        TreeSet<Integer> ts = new TreeSet<>(list);
        if(list.size() == ts.size())
        return false;
        
        int a[] = nums;
        int n = nums.length;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(a[i] == a[j] && Math.abs(i-j) <= k)
                    return true;
        return false;
            
        
    }
}