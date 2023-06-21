class Solution {
    public int numIdenticalPairs(int[] nums) {
      int[] ans = new int[101];
      int count = 0;  
      for (int i = 0; i < nums.length; i++){   
        count =count+ ans[nums[i]];
        ans[nums[i]]++;
      }
      return count;
    }
}