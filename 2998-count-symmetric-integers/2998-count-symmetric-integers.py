class Solution:
    def checkSymmetric(self,n):
        if len(str(n)) % 2 != 0 :
            return False
        m = str(n)
        s1 = 0
        for i in range(len(str(n))//2):
            s1 += int(m[i])
        s2 = 0
        for i in range(len(str(n))//2,len(str(n))):
            s2 += int(m[i])
        if s1 == s2 :
            return True
            return False

        
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        c = 0
        s = Solution();
        for i in range(low,high+1):
            if s.checkSymmetric(i) == True:
                print(i)
                c += 1
        return c

        