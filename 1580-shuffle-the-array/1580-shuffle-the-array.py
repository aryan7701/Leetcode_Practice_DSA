class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        arr1=[]
        arr2=[]
        arr3=[]
        for i in range(n):
            arr1.append(nums[i])
        for i in range(n,2*n):
            arr2.append(nums[i])
        for i in range(n):
            arr3.append(arr1[i])
            arr3.append(arr2[i])
        return arr3