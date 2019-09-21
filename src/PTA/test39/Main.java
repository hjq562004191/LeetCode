package PTA.test39;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s.substring(0,8);
        String s2 = s.substring(8,16);
        String s3 = s.substring(16,24);
        String s4 = s.substring(24,32);

        System.out.println(BinToTen(s1)+"."+BinToTen(s2)+"."+BinToTen(s3)+"."+BinToTen(s4));

    }

    private static int BinToTen(String s) {
        int sum = 0;
        for (int i = 7; i >= 0; i--) {
            if (s.charAt(i) == '1'){
            sum = (int) (sum + Math.pow(2,7-i));
            }
        }
        return sum;
    }

}