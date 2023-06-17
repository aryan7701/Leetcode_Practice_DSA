import java.util.*;
class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[]=new double[2];
        ans[1]=(double)celsius*1.80+32.00;
        ans[0]=(double)celsius+273.15;
        return ans;
    }
}