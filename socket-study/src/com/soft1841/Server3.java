package com.soft1841;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 网络编程,客户端向服务端发送文本数据--控制台版本
 * 2019.5.7
 */
public class Server3 {
    public static void main(String[] args) throws IOException {
        //创建服务器对象，映射端口10086
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            //获得和客户端的连接
            Socket socket = ss.accept();
            ServerThread1 server = new ServerThread1(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread1 implements Runnable{
    private Socket socket;

    public ServerThread1(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端" + socket.getInetAddress()+"连接成功");
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(br.readLine());
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}