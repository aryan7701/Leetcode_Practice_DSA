class Solution {
    public int[] runningSum(int[] nums) {
    int n = nums.length;
    int ans[]= new int [n];
    if(nums.length==0){
        return ans;
    }
    ans[0]=nums[0];
    for(int i=1;i<nums.length;i++){
        ans[i]=ans[i-1]+nums[i];
    }
    return ans;
    }
}