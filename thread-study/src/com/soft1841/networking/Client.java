package com.soft1841.networking;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象，指定连接的服务器IP和接口
        Socket socket = new Socket("192.168.43.155",10086);
        System.out.println("已和服务器建立连接，远程主机地址：" + socket.getRemoteSocketAddress());
    }
}
