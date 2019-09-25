package PTA.test27;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String N = scanner.nextLine();
            if (N.equals("0")) {
                System.out.println(0);
            } else {
                double max = 0;
                double min = 11;
                double sum = 0;
                String s = scanner.nextLine();
                String[] strings = s.split(" ");
                for (int i = 0; i < strings.length; i++) {
                    if (max < Double.parseDouble(strings[i])) {
                        max = Double.parseDouble(strings[i]);
                    } else if (min > Double.parseDouble(strings[i])) {
                        min = Double.parseDouble(strings[i]);
                    }
                    sum += Double.parseDouble(strings[i]);
                }
                sum -= max;
                sum -= min;
                System.out.println(String.format("%.2f", sum / (Integer.parseInt(N) - 2)));
            }
        }
    }
}