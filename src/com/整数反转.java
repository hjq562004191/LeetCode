package com;


public class 整数反转 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String num;
//        boolean f = false;
//        num = scanner.next();
//        scanner.nextLine();
//        int size = num.length();
//        BigInteger big = new BigInteger(num);
//        if (big.intValue() < 0){
//            f = true;
//            size--;
//        }
//        big = big.abs();
//        String num2="";
//        BigInteger c = new BigInteger("10");
//        for (int i = 0; i < size; i++) {
//            num2 += big.remainder(c).toString();
//            big = big.divide(c);
//        }
//        if (new BigInteger(num2).longValue() > Math.pow(2,31)){
//            System.out.println(0);
//        }
//        else {
//            if (f == true)
//                System.out.print("-");
//            System.out.println(num2);
//
//        }
        System.out.println(reverse(-2147483641));
    }

    public static int reverse(int x) {
        if (x == 0 || x == -2147483648) {
            return 0;
        }
        String num = "";
        boolean f = false;
        if (x < 0) {
            f = true;
            x = -x;
        }
        while (x != 0) {
            num += x % 10;
            x /= 10;
        }
        if (f == false && Long.parseLong(num) >= Math.pow(2, 31) - 1) {
            return 0;
        } else if (f == true && Long.parseLong(num) >= Math.pow(2, 31)) {
            return 0;
        } else {
            if (f) {
                return (-1 * Integer.parseInt(num));
            } else {
                return Integer.parseInt(num);
            }
        }
    }
}
