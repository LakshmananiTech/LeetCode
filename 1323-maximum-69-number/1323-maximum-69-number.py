class Solution:
    def maximum69Number (self, num: int) -> int:
        s = ''
        f = 0
        for i in str(num):
            if i == '6' and f == 0:
                s = s + '9'
                f = 1
            else:
                s = s + i
        return int(s)

        