class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for i in words:
            r = i[::-1]
            if i == r:
                return i
        return ""
        