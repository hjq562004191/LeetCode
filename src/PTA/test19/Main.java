package PTA.test19;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        if (a.equals(0)){
            System.out.println(32);
        }else {
            String s = Integer.toBinaryString(a);
            System.out.println(32 - s.length());
        }
    }
}