class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        mag = {}
        for i in magazine:
            mag[i] = mag.get(i,0)+1
        
        for i in ransomNote:
            if i not in mag or mag.get(i) == 0:
                return False
            mag[i] = mag.get(i) - 1
        return True
        