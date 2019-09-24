package ThreadTest;

/**
 * 两个线程交替打印1—100的数字
 */
public class Thread_1 {
    public static volatile boolean flag = true;
    public static volatile int i = 1;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i <= 100){
                    if (flag){
                        System.out.println("Thread 1 "+i++);
                        flag = false;
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i <= 100){
                    if (!flag){
                        System.out.println("Thread 2 "+i++);
                        flag = true;
                    }
                }
            }
        }).start();
    }
}
