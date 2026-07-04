class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        { int k = Arrays.binarySearch(nums,nums[i]);
        if( k != i && k >= 0)
        list.add(nums[i]);
        }
        return list;
    }
}