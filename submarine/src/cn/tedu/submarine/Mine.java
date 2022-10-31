package cn.tedu.submarine;

import javax.swing.*;

/**
 * 水雷
 */
public class Mine extends SeaObject {
    /**
     * 构造方法
     */
    //构造方法
    public Mine(int x, int y) {//每个水雷的x/y初始坐标都是不一样的
        super(11, 11, x, y, 1);//
    }

    /**重构移动方法*/
    @Override
    public void move() {
        y -= speed;//向上
    }

    /**重写getImage()获取图片*/
    @Override
    public ImageIcon getImage() {
        return Images.mine;
    }

    /**检测潜艇越界*/
    public boolean isOutOfBounds() {
        return this.y <= 150 - this.height;
    }
}


















