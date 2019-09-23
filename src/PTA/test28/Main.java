package PTA.test28;


import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean f;
        boolean t3,t6,t9;
        while (scanner.hasNextInt()) {
            f = false;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            for (int i = 1; i <= 100; i++) {
                t3 = false;t6 = false;t9 = false;
                if (i == 100) {
                    f = true;
                }
                if ((a + i) % 10  == 3 || (b + i) % 10  == 3 || (c + i) % 10  == 3) {
                    t3 = true;
                }
                if ((a + i) % 10  == 6 || (b + i) % 10  == 6 || (c + i) % 10  == 6) {
                    t6 = true;
                }
                if ((a + i) % 10  == 9 || (b + i) % 10  == 9 || (c + i) % 10  == 9) {
                    t9 = true;
                }
                if (t3 && t6 && t9){
                    System.out.println(i);
                    break;
                }
            }
            if (f) {
                System.out.println("so sad!");
            }
        }
    }
}