class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0];
        int min=nums[nums.length-1];
        // int min=nums[0];
        // int max=0;
        int ans=-1;
        // int ans[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        for(int j=0;j<nums.length;j++){
            // if(nums[j]==max){
            //     break;
            // }
            // if(nums[j]==min){
            //     break;
            // }
            // if(nums.length>0){
            //     ans= nums[j];
            // }
            if(nums.length<3){
                ans=-1;
            }
            if(nums[j]!=max && nums[j]!=min){
                        ans=nums[j];
                    }
            // else{
            //     for(int k=0;k<nums.length;k++){
            //         if(nums[k]!=max && nums[k]!=min){
            //             ans=nums[k];
            //         }
            //     }
            // }

            // if(nums.length=0)
            // else{
            //     ans=-1;
            // }
        System.out.println(nums[j]);
        }
        
        return ans;
    }
}