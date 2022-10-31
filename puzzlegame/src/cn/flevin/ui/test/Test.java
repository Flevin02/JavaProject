package cn.flevin.ui.test;

import javax.swing.*;

public class Test extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(0, 0, 500, 500);
        JLabel completeImg = new JLabel(new ImageIcon("puzzlegame/image/animal/animal3/all.jpg"));
        completeImg.setBounds(508, 575, 420, 420);
        jFrame.add(completeImg);
        jFrame.setVisible(true);

    }

}
