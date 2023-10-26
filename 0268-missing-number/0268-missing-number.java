class Solution {
    public int missingNumber(int[] nums) {
        int XorAll= nums.length;
        for(int i=0;i<nums.length;i++){
            XorAll^=i^nums[i];
        }
        return XorAll;
    }
}