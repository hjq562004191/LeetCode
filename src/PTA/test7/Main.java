package PTA.test7;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a =scanner.nextInt();
        char m = 'A';
        if (a < 10){
            System.out.println(a);
        }else if (a >= 10 && a <= 15){
            System.out.println((char) (m+a-10));
        }else {
            System.out.println("Invalid input");
        }
    }
}
