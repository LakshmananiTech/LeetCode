class Solution:
    def countAsterisks(self, s: str) -> int:
        c = 0;
        f = 0
        for i in s:
            if i is '|' and f == 0:
                f = 1
            elif i is '|' and f == 1:
                f = 0
            elif i is '*' and f == 1:
                continue
            elif i is '*' and f == 0:
                c += 1
            else:
                continue
        return c
        