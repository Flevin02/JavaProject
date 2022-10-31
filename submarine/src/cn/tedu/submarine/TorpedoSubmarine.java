package cn.tedu.submarine;

import javax.swing.*;

/**
 * 鱼雷潜艇
 */
public class TorpedoSubmarine extends SeaObject implements EnemyScore {

    //构造方法
    public TorpedoSubmarine() {
        super(64, 20);
    }

    /**重写移动move()*/
    @Override
    public void move() {
        x += speed;//x+（向右）
    }

    /**重写getImage获取图片*/
    @Override
    public ImageIcon getImage() {
        return Images.torpesubm;
    }

    /**重写getScore()得分*/
    @Override
    public int getScore() {
        return 40;
    }

}















