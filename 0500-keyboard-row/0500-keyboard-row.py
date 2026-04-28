class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        a = ['q','w','e','r','t','y','u','i','o','p']
        b = ['a','s','d','f','g','h','j','k','l']
        c = ['z','x','c','v','b','n','m']
        tot = []
        for i in words:
            if set(i.lower()).issubset(a) or set(i.lower()).issubset(b) or set(i.lower()).issubset(c):
                tot.append(i)
        return tot


                
                    
        