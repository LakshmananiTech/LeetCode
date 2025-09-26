class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        a = text.split(' ')
        b = []
        for i in brokenLetters:
            b.append(i)
        
        c = 0
        for i in a:
            f = 1
            for j in i:
                if j in b:
                    f = 0
                    break
            if f == 1:
                c +=  1
        return c