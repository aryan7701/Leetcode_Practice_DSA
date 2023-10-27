class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findPermu(nums, res, 0, new ArrayList<>());
        return res;
    }
    private void findPermu(int nums[], List<List<Integer>> res,  int inCkMsk, List<Integer> currPermu){
        int sz = nums.length;
        if(inCkMsk == (1<<sz)-1){
            res.add(new ArrayList<>(currPermu));
            return;
        }
        for(int indx = 0; indx < sz;  indx++){
                if((inCkMsk & (1<<indx)) == 0){
                   currPermu.add(nums[indx]);
                   findPermu(nums, res, (inCkMsk | (1<<indx)), currPermu);
                   
                   currPermu.remove(currPermu.size()-1);
                }
        } 
    }
}