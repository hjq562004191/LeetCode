package niuke;

public class 二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(10));
    }
    public static int NumberOf1(int n) {
        int flag = 1;
        int count = 0;
        int n1 = 32;
        while(n1-- != 0){
            if( (n&flag) == flag){
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
}
