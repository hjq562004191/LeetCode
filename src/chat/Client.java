package chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("请输入昵称");
        Scanner br = new Scanner(System.in);
        String name = br.nextLine();
        if (name.equals("")){
            return;
        }
        Socket client = new Socket("localhost",9999);
        new Thread(new Send(client,name)).start();//一条路径
        new Thread(new Receive(client)).start();//一条路径
    }
}
