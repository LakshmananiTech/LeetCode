class Solution:
    def countTestedDevices(self, batteryPercentages: List[int]) -> int:

        i = 0
        c = 0
        for k in batteryPercentages:
            if k-i > 0 :
                c += 1
                i += 1
        return c


        