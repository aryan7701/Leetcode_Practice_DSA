class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0 , count = 0;
            for (char c : s.toCharArray())
            {
                for ( ;j < t.length(); j++) {
                    if (c == t.charAt(j))
                    {
                        count++;
                        j++;
                        break;
                    }
                }
            }
        return (count == s.length());
    }
}