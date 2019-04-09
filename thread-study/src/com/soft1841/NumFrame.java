package com.soft1841;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalTime;

public class NumFrame extends JFrame {
    private JLabel numberLabel;
    private JLabel localTime;
    private static JPanel panel;
    private static boolean b;

    public NumFrame(){
        init();
        setTitle("多线程窗体");
        setSize(1000,600);
        setLocationRelativeTo(null);

      b = false;
        panel = (JPanel) this.getContentPane();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    private void init(){
        numberLabel = new JLabel();
        localTime = new JLabel();
        Font font = new Font("微软雅黑",Font.BOLD,60);
        numberLabel.setFont(font);
        localTime.setFont(font);
        add(numberLabel,BorderLayout.NORTH);
        add(localTime,BorderLayout.CENTER);

        NumThread numThread = new NumThread();
        numThread.setNumberLabel(numberLabel);
        numThread.start();

        Time time = new Time();
        time.setLocalTime(localTime);
        time.start();
    }


    public static void main(String[] args) {
       final NumFrame numFrame = new NumFrame();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (numFrame) {
                        if (!b) {
                            try {
                                numFrame.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        panel.setBackground(Color.GREEN);
                        System.out.println(Thread.currentThread().getName());
                        b = true;
                        numFrame.notifyAll();
                    }
               }
            }

        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    synchronized (numFrame) {
                        if (b) {
                            try {
                                numFrame.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        panel.setBackground(Color.RED);
                        System.out.println(Thread.currentThread().getName());
                        b = false;
                        numFrame.notifyAll();
                    }

                }
            }
        }).start();

numFrame.setVisible(true);
        new NumFrame();
    }
}
