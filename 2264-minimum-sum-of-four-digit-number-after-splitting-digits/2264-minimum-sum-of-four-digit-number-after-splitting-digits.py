class Solution:
    def minimumSum(self, num: int) -> int:

        n = []
        for k in str(num):
            if int(k) != 0 :
                n.append(int(k))
        n.sort()
        n1 = 0
        n2 = 0
        c = 1
        for k in n:
            if c % 2 != 0:
                n1 = n1 * 10 + k
                c += 1
            else:
                n2 = n2 * 10 + k
                c += 1
        return n1 + n2
        