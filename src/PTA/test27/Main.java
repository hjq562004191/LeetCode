package PTA.test27;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            if (N == 0) {
                System.out.println(0);
            } else {
                float max = 0;
                float min = 999;
                float sum = 0;
                for (int i = 0; i < N; i++) {
                    float a = scanner.nextFloat();
                    if (max < a) {
                        max = a;
                    } else if (min > a) {
                        min = a;
                    }
                    sum += a;
                }
                sum -= max;
                sum -= min;
                System.out.println(String.format("%.2f", sum / (N - 2)));
            }
        }
    }
}