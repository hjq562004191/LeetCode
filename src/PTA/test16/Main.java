package PTA.test16;

import java.util.Scanner;
@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a;
        a = scanner.nextLong();
        if (a == 0){
            System.out.println(-1+" "+1);
        }else {
            if (a % 2 == 0) {
                System.out.println(a / 2 + " " + a / 2);
            } else {
                System.out.println((a - 1) / 2 + " " + (a + 1) / 2);
            }
        }
    }
}