package com.soft1841;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.*;

/**
 * 空布局实现登录窗体
 * @author 张攀华
 * 2019.3.28
 */
public class LoginFrame extends JFrame {
    private JLabel accountLabel,passwordLabel,roleLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton confirmButton,cancelButton;
    private JLabel bgLabel;
    public LoginFrame(){
        init();
        setTitle("登录窗体");
        setSize(640,480);
        setLocationRelativeTo(null);
        //窗体大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init(){
        Font font = new Font("微软雅黑",Font.PLAIN,18);
        accountLabel = new JLabel("账号");
        accountLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        roleLabel = new JLabel("角色");
        roleLabel.setFont(font);
        String[] roles = {"教室","学生"};
        roleComboBox = new JComboBox<>(roles);
        roleComboBox.setFont(font);
        confirmButton = new JButton("确认");
        confirmButton.setFont(font);
        cancelButton = new JButton("取消");
        cancelButton.setFont(font);
        //窗体设置为空布局
        setLayout(null);
        //setBounds方法的四个参数分别为组件x,y组件宽高
        accountLabel.setBounds(140,60,100,35);
        accountField.setBounds(240,60,260,35);
        passwordLabel.setBounds(140,130,100,35);
        passwordField.setBounds(240,130,260,35);
        roleLabel.setBounds(140,200,100,35);
        roleComboBox.setBounds(240,200,260,35);
        confirmButton.setBounds(160,300,100,40);
        cancelButton.setBounds(380,300,100,40);
        confirmButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
        cancelButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        add(accountField);
        add(accountLabel);
        add(passwordLabel);
        add(passwordField);
        add(roleLabel);
        add(roleComboBox);
        add(confirmButton);
        add(cancelButton);
        bgLabel =new JLabel();
        Icon bgIcon = new ImageIcon(LoginFrame.class.getResource("/img/a.jpg"));
        bgLabel.setIcon(bgIcon);
        bgLabel.setBounds(0,0,640,480);
        add(bgLabel);
    }

    public static void main(String[] args) {

     //用beautyeye样式
     try {
         BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
         org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
     }catch (Exception e){
         e.printStackTrace();
     }
      new LoginFrame();
    }
}
