class Solution {
    public int searchInsert(int[] nums, int target) {
        // int l = 0, r = nums.length - 1;
        // int ans=0;
        // while (l <= r) {
        //     int m = l + (r - l) / 2;
        //     if (nums[m] == target){
        //         ans= m;
        //     }
        //     if (nums[m] < target){
        //         l = m + 1;
        //         ans=m+1;
        //     }
        //     else{
        //         r = m - 1;
        //         ans=m-1;
        //     }
        // }
        // return ans;
            for(int position=0; position< nums.length;position++){

        if(nums[position]==target){
            return position;
        }
    }

    for(int position2=nums.length-1;position2>=0;position2--){
        if(nums[position2]< target ){
            return position2+1;
        }

    }

    return 0;
    }
}