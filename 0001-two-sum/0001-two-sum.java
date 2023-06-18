class Solution {
    public int[] twoSum(int[] nums, int target) {
       int arr[]= new int[2];
       int sum=0;
       for(int i=0;i<nums.length;i++){
        //    int j=nums.length-1;
        for(int j=nums.length-1;j>i;j--){
            sum=nums[i]+nums[j];
            if(sum==target){
               arr[0]=i;
               arr[1]=j;
               break;
           }
        }   
       }
       return arr;
    }
}