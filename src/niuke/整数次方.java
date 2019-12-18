package niuke;

public class 整数次方 {
    public static void main(String[] args) {

    }
    public double Power(double base, int exponent) {
        if(exponent < 0){
            base = 1.0/base;
            exponent = -exponent;
        }
        if(base == 0) return 0;
        if(exponent == 0) return 1;
        if(exponent == 1) return base;
        double result = 0.0;
        if( (exponent & 1) == 0 && exponent > 1){
            result = Power(base,exponent/2);
            return result * result;
        }else{
            result = Power(base,exponent/2);
            return result * result * base;
        }
    }
}
