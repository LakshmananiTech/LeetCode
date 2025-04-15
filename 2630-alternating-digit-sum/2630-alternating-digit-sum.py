class Solution:
    def alternateDigitSum(self, n: int) -> int:
        c = 1
        s = 0
        for k in str(n):
            if c % 2 != 0 :
                s = s + int(k)
            else:
                s = s - int(k)
            c += 1
        return s

        