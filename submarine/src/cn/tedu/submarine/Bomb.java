package cn.tedu.submarine;

import javax.swing.*;

/**
 * 炸弹
 */
public class Bomb extends SeaObject {
    /**
     * 构造方法
     */
    //构造方法
    public Bomb(int x, int y) {
        super(9, 12, x, y, 3);
    }

    public void move() {
        y += speed;//向下
    }

    public ImageIcon getImage() {
        return Images.bomb;
    }

    /**
     * 重写检测炸弹越界
     */
    @Override
    public boolean isOutOfBounds() {
        return this.y >= World.HEIGHT;
    }
}



















