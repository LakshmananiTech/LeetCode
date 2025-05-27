class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        i=0
        l = []
        for k in words:
            if x in k:
                l.append(i)
            i += 1
        return l