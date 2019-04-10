package com.soft1841;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawLineThread implements Runnable {
    int x = 500;
    int y = 100;
    private JFrame frame;
    private Color[] colors = {Color.WHITE,Color.BLUE,Color.CYAN,Color.GREEN,Color.ORANGE,
            Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY };

    public void setFrame(JFrame frame){
        this.frame = frame;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Graphics graphics = frame.getGraphics();
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(x,y,700,y);
            y += 10;
            if (y >= 400){
                y=100;
            }
        }
    }
}
