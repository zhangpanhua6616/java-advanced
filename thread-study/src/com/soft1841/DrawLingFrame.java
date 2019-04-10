package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 * 绘图线程
 * 2019.4.10
 */
public class DrawLingFrame extends JFrame {
    public DrawLingFrame(){
        init();
        setTitle("绘制彩色线段");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init(){
        getContentPane().setBackground(new Color(0,0,0));
        DrawLineThread drawLineThread = new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();

    }

    public static void main(String[] args) {
        new DrawLingFrame();
    }
}
