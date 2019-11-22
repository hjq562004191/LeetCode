package Test;

public class 线程 {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new Thread01());
        Thread thread02 = new Thread(new Thread01());
        thread01.start();
        thread02.start();

    }
}

class Thread01 implements Runnable{
    static volatile int num = 0;
    public static synchronized void increase() {
        num++;
    }
    @Override
    public  void run() {
        for (int i = 0; i < 100; i++) {
            increase();
        }
        System.out.println(num);
    }
}

// 使用Thread进行run方法的编写，开启线程
class Thread02 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("T2 " + number.num++);
        }
    }
}

class number{
    static int num = 0;
}
