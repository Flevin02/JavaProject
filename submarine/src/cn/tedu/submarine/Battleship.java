package cn.tedu.submarine;

import javax.swing.*;

//战舰
public class Battleship extends SeaObject {
    private int life;//命数

    public Battleship() {
        super(66, 26, 270, 124, 20);
        life = 5;
    }

    /*战舰移动*/
    public void move() {
    }

    /*重写getImage()获取图片*/
    @Override
    public ImageIcon getImage() {
        return Images.battleship;
    }

    /*战舰放出炸弹*/
    public Bomb shoot() {
        return new Bomb(this.x, this.y);//将战舰坐标定为炸弹初始位置
    }

    /*左移*/
    public void moveLeft() {//左移
        x -= speed;
    }

    /*右移*/
    public void moveRight() {//右移
        x += speed;
    }

    /*战舰增命*/
    public void addLife(int num) {
        life += num;
    }

    /*获取战舰的命数*/
    public int getLife() {
        return life;  //返回命数
    }

    /*战舰减命*/
    public void subtractLive() {
        life--;
    }
}

