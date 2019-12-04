package niuke;

import java.math.BigInteger;
import java.util.Scanner;

public class 爬楼梯 {
    public static void main(String[] args){
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger ret = new BigInteger("0");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n <= 3){
            System.out.println(n);
            return;
        }
        for(int i = 3;i <= n;i++){
            ret = one.add(two);
            one = two;
            two = ret;
        }
        System.out.println(ret);
    }
}
