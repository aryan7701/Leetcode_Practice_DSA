import java.math.*;
class Solution {
    public int maxProduct(int[] nums) {
        // int i=0;
        int n= nums.length;
        // int j=n-1;
        // int curproduct=(nums[0]-1)*(nums[n-1]-1);
        // int maxproduct=1;
        // for(int i=0;i<n;i++){
        //     maxproduct=Math.max((nums[i]-1)*(nums[j]-1),maxproduct);
        //     j--;
        // }
        // return maxproduct;
        Arrays.sort(nums);
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}