class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        def custom(num):
            bit = bin(num).count('1')
            return (bit,num)

        arr.sort(key =custom)

        return arr