class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        l = []
        s = set(nums)
        for i in s:
            if nums.count(i) == 2 :
                l.append(i)
        return l
        