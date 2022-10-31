package cn.tedu.submarine;


import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.util.Random;

/**
 * 海洋对象
 */
public abstract class SeaObject {
    public static final int LIVE = 0;//活着的
    public static final int DEAD = 1;//死了的
    protected int state = LIVE;//当前状态(默认为活着的)

    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    /**
     * 专门给侦查潜艇，水雷潜艇，鱼雷潜艇提供
     */
    //因为三种潜艇的宽高不一样，所以数据不能写死，需传参写活
    //因为三种潜艇的x/y/speed是一样的，所以数据可以写死，不需要传参
    public SeaObject(int width, int height) {
        this.width = width;
        this.height = height;
        x = -width;
        Random rand = new Random();
        y = rand.nextInt(World.HEIGHT - height - 150 + 1) + 150;//生成
        speed = rand.nextInt(3) + 1;//生成1~3的随机数
    }

    /**
     * 专门给水雷，深水炸弹，战舰提供
     */
    //因为战舰/炸弹/水雷的宽/高/x/y/speed都是不一样的，所以数据不能写死，需要传参写活
    public SeaObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    /**
     * 海洋对象移动
     */
    public abstract void move();

    /**
     * 获取对象的图片
     */
    public abstract ImageIcon getImage();

    /**
     * 判断对象是否活着
     */
    public boolean isLive() {
        return state == LIVE;//若当前状态为LIVE，则返回true表示活着的，否者返回false
    }

    /**
     * 判断对象是否死亡
     */
    public boolean isDead() {
        return state == DEAD;//若当前状态为DEAD，则返回true表示死亡，否者返回false
    }

    /**
     * 画对象 g:画笔
     */
    public void paintImage(Graphics g) {
        if (this.isLive()) {//若活着
            this.getImage().paintIcon(null, g, this.x, this.y);
        }
    }

    /**
     * 检测潜艇越界
     */
    public boolean isOutOfBounds() {
        return this.x >= World.WIDTH;
    }

    /**
     * 检测碰撞  this指一个对象 other另一个对象
     */
    public boolean isHit(SeaObject other) {
        int x1 = this.x - other.width;
        int x2 = this.x + this.width;
        int y1 = this.y - other.height;
        int y2 = this.y + this.height;
        int x = other.x;
        int y = other.y;

        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }

    /**
     * 海洋对象死亡
     */
    public void goDEAD() {
        state = DEAD;
    }
}











