class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        int r = 0;
        int c =grid[0].length-1;
        while(r<grid.length && c>=0){
            if(grid[r][c]>=0){
                r++;
            }
            else{
                c--;
                ans+=grid.length-r;
            }
        }
        return ans;
    }
}