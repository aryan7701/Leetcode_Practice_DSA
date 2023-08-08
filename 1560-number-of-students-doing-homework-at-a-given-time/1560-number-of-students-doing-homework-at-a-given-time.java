class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        // int i=0;
        // int j= startTime.length-1;
        int count =0;
        for(int i=0;i<=startTime.length-1;i++){
            if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                count++;
            }
        }
        return count;
    }
}