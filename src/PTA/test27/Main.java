package PTA.test27;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double max = 0;
        double min = 999;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double a = scanner.nextDouble();
            if (max < a){
                max = a;
            }
            if (min > a){
                min = a;
            }
            sum += a;
        }
        sum -= max;
        sum -= min;
        System.out.println(String.format("%.2f",sum/(N-2)));
    }
}