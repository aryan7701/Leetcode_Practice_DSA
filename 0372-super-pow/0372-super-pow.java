class Solution{
private static final int M = 1337;

    public int pow(int a, int b) {
        int result = 1;
        while (b != 0) {
            if (b % 2 != 0)
                result = result * a % M;
            a = a * a % M;
            b /= 2;
        }
        return result;
    }
     int res = 1;
    public int superPow(int a, int[] b) {
       a %= M; 
       for(int digit : b){
           res = (pow(res,10) * pow(a,digit)) % M;
       }
       return res; 
    }
}