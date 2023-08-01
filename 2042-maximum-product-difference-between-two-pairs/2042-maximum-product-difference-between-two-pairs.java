class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);
       int diff= (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
       return diff;
    }
}