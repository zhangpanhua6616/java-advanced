package com.soft1841;

import javax.swing.*;
import java.awt.*;
/**
 * 在窗体中绘制图像
 * 2019.4.11
 */
public class DrawImageTest extends JFrame {
    public DrawImageTest(){
    //设置窗体大小
    this.setSize(500,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //设置窗体面板为绘图面板对象
    add(new CanvasTest());
    this.setTitle("绘制图像");
    }

    public static void main(String[] args) {
        new DrawImageTest().setVisible(true);
    }
    //创建画布
    class CanvasTest extends Canvas{
        public void paint(Graphics graphics){
            super.paint(graphics);
            //创建绘图对象
            Graphics2D graphics2D = (Graphics2D)graphics;
            Image img = new ImageIcon(this.getClass().getResource("/img/u0.png")).getImage();
            //显示图像
            graphics2D.drawImage(img,0,0,this);
        }
    }
}
