package chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Send implements Runnable {
    private Scanner console;
    private DataOutputStream dos;
    private boolean isRunning = true;
    private String name;

    public Send(){
        console = new Scanner(System.in);
    }
    public Send(Socket client,String name) throws IOException {
        this();
        try {
            dos = new DataOutputStream(client.getOutputStream());
            this.name = name;
            send(this.name);
        } catch (IOException e) {
            isRunning = false;
            dos.close();
            console.close();
            //e.printStackTrace();
        }
    }

    private String getMsgFromConsole(){
        return console.nextLine();
    }

    public void send(String msg) throws IOException {
        try {
            if (null != msg){
                dos.writeUTF(msg);
                dos.flush();
            }
        } catch (IOException e) {
            // e.printStackTrace();
            isRunning = false;
            dos.close();
            console.close();
        }

    }
    @Override
    public void run() {
        while (isRunning){
            try {
                send(getMsgFromConsole());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
