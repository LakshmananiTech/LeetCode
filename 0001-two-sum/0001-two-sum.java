class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int[] ans = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            int key1 = target - nums[i];
            if(m.containsKey(key1)){
                ans[0] = i;
                ans[1] = m.get(key1);
                break;
            }
            m.put(nums[i],i);
        }
        
        return ans;
    }
}
//[2,11,15,7] ,t = 9
/*
m = {2:0,11:1,15:2,}


*/