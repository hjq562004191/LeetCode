package niuke;

import java.math.BigInteger;
import java.util.Scanner;

public class 爬楼梯2 {
    public static void main(String[] args){
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("1");
        BigInteger three = new BigInteger("2");
        BigInteger ret = new BigInteger("0");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 3){
            System.out.println(2);
            return;
        }
        if(n == 1 || n == 2){
            System.out.println(1);
            return;
        }
        for(int i = 4;i <= n;i++){
            ret = one.add(three);
            one = two;
            two = three;
            three = ret;
        }
        System.out.println(ret);
    }
}
