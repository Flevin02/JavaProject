package cn.tedu.submarine;

import javax.swing.*;

/**
 * 侦察潜艇
 */
public class ObserveSubmarine extends SeaObject implements EnemyScore {
    //构造方法
    public ObserveSubmarine() {
        super(63, 19);
    }

    /**
     * 重写移动move()
     */
    @Override
    public void move() {
        x += speed;
    }

    /**
     * 重写getImage()获取图片
     */
    @Override
    public ImageIcon getImage() {
        return Images.obsersubm;
    }

    /**
     * 重写getScore()得分
     */
    @Override
    public int getScore() {
        return 10;
    }
}












