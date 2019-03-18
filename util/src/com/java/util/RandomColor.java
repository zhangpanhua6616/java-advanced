package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 随机颜色练习
 */
public class RandomColor {
    public static void main(String[] args) throws IOException {
        //随机种子
        Random random = new Random();
        //随机颜色
        int redRandom = random.nextInt(256);
        int greenRandom = random.nextInt(256);
        int blueRandom = random.nextInt(256);
        System.out.println("R:"+redRandom+",G:"+greenRandom+"B:"+blueRandom);
        //在图片缓冲区生成一个图片对象,指定图片大小和类型
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_BGR);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色，使用随机生成的颜色
        Color color = new Color(redRandom,greenRandom,blueRandom);
        g.setColor(color);
        //画干扰线
        for (int i = 0;i < 20;i++){
            int x1 = random.nextInt(120);
            int y1 = random.nextInt(40);
            int x2 = random.nextInt(120);
            int y2 = random.nextInt(40);
            g.drawLine(x1,y1,x2,y2);

        }

        //开始绘制矩形，充满图片缓冲区
        g.fillRect(0,0,120,40);
        //绘制黑色文字
        g.setColor(Color.BLACK);
        g.drawString("验证码",40,15);
        //输出图片，本地文件的路径
        File file = new File("D:/code.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();
    }
}
