class Solution {
    public int numIdenticalPairs(int[] nums) {
      int count=0;
      int ans[]= new int[102];
      for(int i=0;i<nums.length;i++){
        count=count+ans[nums[i]];
        ans[nums[i]]++;
      }
      return count;
    }
}