package com.soft1841;
/**
 * 线程读取网络图片
 */

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetImageByNet extends Object implements Runnable {
    public static void main(String[] args) {
        GetImageByNet getImageByNet = new GetImageByNet();
        getImageByNet.run();
    }
    @Override
    public void run() {
        try {
            //创建一个URL对象
            URL url = new URL("http://b-ssl.duitang.com/uploads/item/201705/15/20170515153219_ScPCv.jpeg");
            //打开链接
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            //设置请求方式为“GET”
            connection.setRequestMethod("GET");
            //超时响应为5秒
            connection.setConnectTimeout(5*1000);
            //通过输入流获取图片数据
            InputStream inputStream = connection.getInputStream();
            //得到图片的二进制数据，以二进制封装得到数据，具有通用性
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            //准备缓冲字节数组
            byte[] buffer = new byte[1024];
            int len = 0;
            //每次读入一个缓冲区大小的字节数
           while ((len = inputStream.read(buffer)) != -1){
               //将缓冲区内容写出
               outputStream.write(buffer,0,len);
            }
            inputStream.close();
           //通过输出流获取到字节数组
            byte[] date = outputStream.toByteArray();
            //new一个文件对象来保存图片，默认保存到当前工程根目录
            File imageFile = new File("D:/10.jpg");
            //创建输出流
            OutputStream outputStream1 = new FileOutputStream(imageFile);
            //写入数据
            outputStream1.write(date);
            outputStream1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
