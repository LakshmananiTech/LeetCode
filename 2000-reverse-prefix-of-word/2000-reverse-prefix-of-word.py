class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        if word.find(ch) == -1:
            return word
        return word[0:word.find(ch)+1:][::-1]+word[word.find(ch)+1::]
        