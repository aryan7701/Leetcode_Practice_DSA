class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(char va:s.toCharArray())c^=va;
        for(char lo:t.toCharArray())c^=lo;
        return c;
    }
}