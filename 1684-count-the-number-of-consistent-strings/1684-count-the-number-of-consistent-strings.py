class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        l = []
        for i in allowed:
            l.append(i)
        count = 0;
        k = []
        for i in words:
            for j in i:
                k.append(j)
            s = set(k)
            p = list(s)
            b = True
            for t in p:
                if t not in l:
                    b = False
                    break
            if b == True:
                count = count + 1
            k.clear()
        return count
        