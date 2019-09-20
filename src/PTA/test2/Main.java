package PTA.test2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a,b;
        while (scanner.hasNext()){
            a = scanner.nextBigDecimal();
            b = scanner.nextBigDecimal();
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }
}
