class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        v = 0
        for i in operations:
            if i == '++X' or i == 'X++' :
                v += 1
            else:
                v -= 1
        return v


        