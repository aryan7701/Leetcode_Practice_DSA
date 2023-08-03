class Solution {
    public boolean isThree(int n) {
       boolean ans=true;
       int count=0;
       //m dividor n if n=k*m
       for(int i=1;i<=n/2;i++){
           if(n%i==0){
               count+=1;
           }
       }
       count++;
       if(count==3){
           return true;
       }
       else{
           return false;
       }
    }
}