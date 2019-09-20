package PTA.test22;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int zheng = 0;
        int fu = 0;
        int sum = 0;

        do {
            a = scanner.nextInt();
            if (a > 0){
                zheng++;
                sum +=a;
            }else if (a < 0){
                fu++;
                sum +=a;
            }
        }while (a != 0);
        System.out.println(zheng);
        System.out.println(fu);
        System.out.println(sum);
        if (zheng+fu != 0) {
            System.out.println(sum / (double) (zheng + fu));
        }else {
            System.out.println(0);
        }
    }
}