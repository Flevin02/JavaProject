package cn.flevin.MemberClass;

import java.awt.image.BufferedImage;

/**
 * @Project JavaProject
 * @Description 英雄类
 * @Author FLevin
 * @Date 2022/10/20
 */

public class Hero extends FlyingObject {

    private int life;   //命
    private int fire;   //火力值

    /**
     * 构造方法
     */
    public Hero() {
        super(97, 139, 140, 400);
        life = 3;
        fire = 0;
    }

    /**
     * 重写step()移动
     */
    public void step() {
        //暂时搁置
    }

    /**
     * 英雄机发射子弹(生成子弹对象)
     */
    public Bullet[] shoot() {
        int xStep = this.width / 4; //1/4英雄机的宽
        int yStep = 20; //固定的20
        if (fire > 0) { //双倍
            Bullet[] bs = new Bullet[2]; //2发子弹
            bs[0] = new Bullet(this.x + xStep, this.y - yStep); //x:英雄机的x+1/4英雄机的宽  y:英雄机的y-固定的20
            bs[1] = new Bullet(this.x + 3 * xStep, this.y - yStep); //x:英雄机的x+3/4英雄机的宽  y:英雄机的y-固定的20
            fire -= 2; //发射一次双倍火力，则火力值减2
            return bs;
        } else { //单倍
            Bullet[] bs = new Bullet[1]; //1发子弹
            bs[0] = new Bullet(this.x + 2 * xStep, this.y - yStep); //x:英雄机的x+2/4英雄机的宽  y:英雄机的y-固定的20
            return bs;
        }
    }

    int index = 0; //下标

    /**
     * 重写getImage()获取图片
     */
    public BufferedImage getImage() { //每10毫秒走一次
        return Images.heros[index++ % Images.heros.length]; //heros[0]和heros[1]来回切换
        /* 执行过程:
                              index=0
           10M  返回heroes[0]  index=1
           20M  返回heroes[1]  index=2
           30M  返回heroes[0]  index=3
           40M  返回heroes[1]  index=4
           50M  返回heroes[0]  index=5
         */
    }
}
