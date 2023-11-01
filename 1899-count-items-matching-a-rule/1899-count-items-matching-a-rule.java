class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int ans = 0 ;
        String str = "";
        for(int i = 0 ; i < items.size() ; i++){
            
            if(ruleKey.equals("type")){
                str = "";
                str = items.get(i).get(0) ;
                if(str.equals(ruleValue)){
                    ans ++ ;
                }
            
            }else if(ruleKey.equals("color")){
                str = "";
                str = items.get(i).get(1) ;
                
                if(str.equals(ruleValue)){
                   
                    ans ++ ;
                }
            }else{
                 str = "";
                str = items.get(i).get(2) ;
                if(str.equals(ruleValue)){
                    ans ++ ;
                }
            }
        }
                
            return ans ;
    }
}