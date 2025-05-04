class Solution:
    def numEquivDominoPairs(self, dominoes: List[List[int]]) -> int:
        d = {}
        c = 0
        for i in dominoes:
            i.sort()
            n = i[0]*10 + i[1]
            print(n)
            d[n] = d.get(n,0)+1
        for i,j in d.items():
            
            if j > 1:
                j = j * (j-1) // 2
                c += j
        return c 
        
