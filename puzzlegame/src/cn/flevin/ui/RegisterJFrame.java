package cn.flevin.ui;

import javax.swing.*;

/**
 * 注册界面
 */
public class RegisterJFrame extends JFrame {
    public RegisterJFrame() {
        initJFrame();

    }

    private void initJFrame() {
        this.setSize(488, 500);

        //设置界面标题
        this.setTitle("拼图 注册");

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
