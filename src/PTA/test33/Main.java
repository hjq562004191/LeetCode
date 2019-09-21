package PTA.test33;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        StringBuilder b = new StringBuilder("                                       "); //39个空格
        String c = " ";
        int k = 1;
        for (char i = 'A'; i < N.charAt(0); i++) {
            System.out.print(b);
            if (i == 'A'){
                System.out.println(i);
            }else {
                System.out.print(i);
                System.out.print(c);
                System.out.println(i);
                c += "  ";
            }
            b.delete(0,1);
            k++;
        }
        System.out.print(b);
        for (int i = 0; i < 2*k -1; i++) {
            System.out.print(N);
        }
    }
}