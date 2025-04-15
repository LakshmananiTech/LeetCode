class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        ans = []
        for k in nums:
            for i in str(k):
                ans.append(int(i))
        return ans

        