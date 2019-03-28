package com.soft1841;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;

/**
 * BoxLayout布局示例
 * @author 张攀华
 * 2019.3.29
 */
public class BoxLayoutTest extends JFrame {
    public BoxLayoutTest(){
        init();
        setTitle("BoxLayout布局");
        setSize(410,730);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        //重新设置窗体布局为具水平和垂直间距的BorderLayout
        setLayout(new BorderLayout(20, 20));
        //顶部面板
        JPanel topJPane = new JPanel();
        //对topPanel进行水平方向排列的BoxLayout布局
        BoxLayout boxLayout = new BoxLayout(topJPane, BoxLayout.X_AXIS);
        topJPane.setBackground(new Color(255,127,0));
        topJPane.setPreferredSize(new Dimension(414, 100));
        //左侧按钮
        JButton LeftButton = new JButton("扫一扫");
        LeftButton.setPreferredSize(new Dimension(80, 30));
        topJPane.add(LeftButton);
        //加入一个glue，会挤占两个按钮之间的空间
        topJPane.add(Box.createHorizontalGlue());
        //右侧按钮
        JButton RightButton = new JButton("会员码");
        RightButton.setPreferredSize(new Dimension(80, 30));
        topJPane.add(RightButton);
        //topPane加入窗体顶部
        add(topJPane, BorderLayout.NORTH);
        //中间的middlePanel面板，垂直方向的BoxLayout布局
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
        //创建三个面板，加入middlePanel
        for (int i = 0; i < 3; i++) {
            JPanel jPanel = new JPanel();
            jPanel.setPreferredSize(new Dimension(410, 120));
            jPanel.setBackground(new Color(255, 215, 0));
            //分别将每次创建的面板加入middlePanel
            middlePanel.add(jPanel);
            //每个加入的面板下方，加入一个垂直方向的Strut，突出一点距离
            middlePanel.add(Box.createVerticalStrut(20));
        }
        //最后将middlePanel加入窗体的中间区域
        add(middlePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new BoxLayoutTest();
    }
}
