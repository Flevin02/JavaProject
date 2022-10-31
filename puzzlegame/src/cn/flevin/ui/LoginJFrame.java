package cn.flevin.ui;

import javax.swing.*;

/**
 * 登录界面
 */
public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        initJFrame();
    }

    private void initJFrame() {
        this.setSize(488, 430);

        //设置界面标题
        this.setTitle("拼图 登录");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //显示界面
        this.setVisible(true);
    }

}
