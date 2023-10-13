class Solution {
    public int searchInsert(int[] nums, int target) {
        
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