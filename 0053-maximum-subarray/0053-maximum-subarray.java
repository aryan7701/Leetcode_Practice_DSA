import java.math.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int result=Integer.MIN_VALUE;
        int total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum=Math.max(nums[i],total_sum+nums[i]);
            if(result<total_sum){
                result=total_sum;
            }
            if(result==0){
                result=0;
            }
        }
        return result;
    }
}