class Solution {
    public int divide(int dividend, int divisor) {
        double d1 = 0;
        double d2 = 0;
        if(divisor <0){
            d1 = 0-(divisor);
        }
        else{
            d1 = divisor; 
        }
        if(dividend <0){
            d2 = 0-(dividend);
        }
        else{
            d2 = dividend; 
        }
        double total = 0;
        for(double i=d1;i<=d2;i+=d1){
           total++;
        }
        if(dividend<0 && divisor<0){
            return (int)total;
        }

        if(dividend<0){
            return(int) -(total);
        }
        if(divisor<0){
            return(int) -(total);
        }
        return (int)total;
    }
}
public class temp{
    public static void main(String[] args) {
        Solution s1 = new Solution();
       System.out.println( s1.divide(-2147483648, -1));;
    }
}