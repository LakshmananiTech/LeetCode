class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        l1 = nums1
        l2 = nums2
        l3 = l1 + l2
        l3.sort()
        c = len(l3)
        if c%2 != 0:
           return(float(l3[c//2]))
        else:
           return((l3[c//2]+l3[c//2-1])/2)


        