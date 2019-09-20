package PTA.test4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n;
        BigDecimal bigDecimal,sum = BigDecimal.valueOf(0L);
        while (scanner.hasNext()){
            n = scanner.nextLine();
            if ("e".equals(n) || "E".equals(n)){
                break;
            }
            bigDecimal = new BigDecimal(n);
            sum = sum.add(bigDecimal);
        }
        System.out.println(sum);
    }
}
