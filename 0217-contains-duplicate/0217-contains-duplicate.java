class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ans=false;
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]==nums[i+1]){
                ans=true;
            }
        }
        return ans;
    }
}