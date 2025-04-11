class Solution:
    def checkString(self, s: str) -> bool:

        n = s.find('b')
        if n == -1:
            return True
        k = s.find('a',n)
        if k > n:
            return False
        return True
        