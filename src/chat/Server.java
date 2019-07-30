package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Mychannel> all = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new Server().start();

    }

    public void start() throws IOException {
        ServerSocket server = new ServerSocket(9999);

        while (true){
            Socket client = server.accept();
            Mychannel channel = new Mychannel(client);
            all.add(channel);
            new Thread(channel).start();
        }

    }
    /**
     * 一个客户端一条道路
     *
     */
    private  class Mychannel implements Runnable{
        private DataOutputStream dos ;
        private DataInputStream dis ;
        private boolean isRunning = true;
        private String name;
        public Mychannel(Socket client) throws IOException {
            try {
                dis = new DataInputStream(client.getInputStream());
                dos = new DataOutputStream(client.getOutputStream());

                this.name = dis.readUTF();

                this.send("欢迎进入聊天室");
                sendOthers(this.name+"  加入了聊天室");
            } catch (IOException e) {
                //e.printStackTrace();
                dis.close();
                dos.close();
                isRunning = false;
                all.remove(this);
            }
        }

        private void sendOthers(String msg) throws IOException {
            if (msg.startsWith("@") && msg.indexOf(":")>-1){
                //私聊
                //获取name
                String name = msg.substring(1,msg.indexOf(":"));
                String content = msg.substring(msg.indexOf(":")+1);
                for (Mychannel other:all
                ) {
                    if (other.name.equals(name)){
                        other.send(this.name+"对您悄悄说："+content);
                    }
                }
            }else {
                for (Mychannel other : all) {
                    if (other == this) {
                        continue;
                    }
                    other.send(msg);
                }
            }
        }
        private String receive() throws IOException {
            String msg = "";
            try {
                msg = dis.readUTF();
            } catch (IOException e) {
                //e.printStackTrace();
                isRunning = false;
                dis.close();
                dos.close();
                all.remove(this);
            }
            return msg;
        }

        private void send(String msg) {
            if (null == msg || msg.equals("")){
                return;
            }
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                //e.printStackTrace();
                isRunning = false;
                try {
                    dos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        @Override
        public void run() {
            while (isRunning){
                try {
                    sendOthers(receive());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
