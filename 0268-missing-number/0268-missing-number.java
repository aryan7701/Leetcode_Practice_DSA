class Solution {
    public int missingNumber(int[] nums) {
        int SumArr=0;
        int n= nums.length;
        for(int i=0;i<nums.length;i++){
            SumArr=SumArr+nums[i];
        }
        int Sum= n*(n+1)/2;
        return Sum-SumArr;
    }
}