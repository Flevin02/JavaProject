package cn.flevin.MemberClass;

import java.awt.image.BufferedImage;

/**
 * @Project JavaProject
 * @Description 天空类
 * @Author FLevin
 * @Date 2022/10/20
 */

public class Sky extends FlyingObject {

    private int speed; //移动速度
    private int y1; //第2张图片的y坐标

    /**
     * 构造方法
     */
    public Sky() {
        super(World.WIDTH, World.HEIGHT, 0, 0);
        speed = 1;
        y1 = -World.HEIGHT;
    }

    /**
     * 重写step()移动
     */
    public void step() {
        y += speed;  //y+(向下)
        y1 += speed; //y1+(向下)
        if (y >= 700) { //若y>=窗口的高，表示移到最下面了
            y = -700; //则将y修改为负的窗口的高，即移到最上面去
        }
        if (y1 >= 700) { //若y1>=窗口的高，表示移到最下面了
            y1 = -700; //则将y1修改为负的窗口的高，即移到最上面去
        }
    }

    /**
     * 重写getImage()获取图片
     */
    public BufferedImage getImage() { //每10毫秒走一次
        return Images.sky; //返回sky图片即可
    }

    /**
     * 获取y1坐标
     */
    public int getY1() {
        return y1; //返回y1坐标
    }
}
