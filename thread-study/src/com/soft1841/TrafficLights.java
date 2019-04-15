package com.soft1841;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * 在窗体上实现交通信号灯
 * 张攀华
 * 2019.4.15
 */
public class TrafficLights extends JFrame {
    //内容面板
    private JPanel contentPanel;
    //图片标签
    private JLabel bgLabel;
    private JPanel bgPanel;

    public TrafficLights(){
        init();
        setTitle("模拟红绿灯变化场景");
        //窗体自动居中
        setLocationRelativeTo(null);
        setSize(100,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void init(){
        //内容面板
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        setContentPane(contentPanel);
        //图片面板
        bgPanel = new JPanel();
        bgPanel.setBackground(Color.WHITE);
        bgPanel.setBorder(new TitledBorder(null, "交通灯", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPanel.add(bgPanel);
        bgPanel.setLayout(new BorderLayout(0, 0));
        //标签
        bgLabel = new JLabel();
        bgLabel.setBackground(Color.WHITE);
        bgLabel.setIcon(new ImageIcon(TitledBorder.class.getResource("/img/Green.png")));
        bgPanel.add(bgLabel, BorderLayout.CENTER);

        TurnColor turnColor = new TurnColor();
        turnColor.setBgLabel(bgLabel);
        turnColor.start();
    }

    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights();
        trafficLights.setVisible(true);
    }
}
