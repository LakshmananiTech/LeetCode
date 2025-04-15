class Solution:
    def countEven(self, num: int) -> int:
        c = 0
        for i in range(1,num+1):
            s = 0
            for k in str(i):
                s = s + int(k)
            if s % 2 == 0 :
                c += 1
        return c

        