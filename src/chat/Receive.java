package chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receive implements Runnable {
    private DataInputStream dis;
    private boolean isRunning = true;

    public Receive(){

    }
    public Receive(Socket client) throws IOException {
        try {
            dis = new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            isRunning = false;
            dis.close();
        }
    }

    public String receive() throws IOException {
        String msg = "";
        try {
            msg = dis.readUTF();
        } catch (IOException e) {
            //e.printStackTrace();
            isRunning = false;
            dis.close();
        }
        return msg;
    }
    @Override
    public void run() {
        while (isRunning){
            try {
                System.out.println(receive());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
