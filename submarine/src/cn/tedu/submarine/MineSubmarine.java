package cn.tedu.submarine;

import javax.swing.*;

/**
 * 水雷潜艇
 */
public class MineSubmarine extends SeaObject implements EnemyLife {
    //构造方法
    public MineSubmarine() {
        super(63, 19);
    }

    /**重写移动move()*/
    @Override
    public void move() {
        x += speed;//x+（向右）
    }

    /**重写getImage()获取图片*/
    @Override
    public ImageIcon getImage() {
        return Images.minesubm;
    }

    /**
     * 潜艇发射水雷
     */
    public Mine shootMine() {
        return new Mine(this.x + this.width, this.y - 5);
    }

    /**重写getLife()得命*/
    @Override
    public int getLife() {
        return 1;
    }
}



















