class Solution {
    public boolean wordPattern(String pattern, String s) {
        int preIndex = 0;
        int index = 0;
        int n = pattern.length();
        String [] str = new String[n+5];
        int i = 0;
        do {
            index = s.indexOf(' ', preIndex);
            if(index==-1) break;
            str [i] = s.substring(preIndex, index);
            i++;
            preIndex = index+1;
        }while(true);
        str[i] = s.substring(preIndex);
        if(i+1 != n) return false;   
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> StringMap = new HashMap<>();
        for(i = 0; i < n; i++)
        {
            char ch = pattern.charAt(i);
            if(patternMap.containsKey(ch))
            {
                if(!patternMap.get(ch).equals(str[i]))
                {
                    return false;
                }
            }
            else
            {
                patternMap.put(ch, str[i]);
            }
            if(StringMap.containsKey(str[i]))
            {
                if(StringMap.get(str[i]) != ch)
                {
                    return false;
                }
            }
            else
            {
                StringMap.put(str[i], ch);
            }
        }
        return true;
        
    }
}