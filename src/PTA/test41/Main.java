package PTA.test41;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(Integer.parseInt(sb.toString()));
    }
}