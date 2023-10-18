class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        for(int k=0;k<nums.length;k++){
            ans[k]=0;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}