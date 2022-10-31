package cn.flevin.MemberClass;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @Project JavaProject
 * @Description 蜜蜂类
 * @Author FLevin
 * @Date 2022/10/20
 */

public class Bee extends FlyingObject {

    private int xSpeed; //x坐标移动速度
    private int ySpeed; //y坐标移动速度
    private int awardType; //奖励类型

    /**
     * 构造方法
     */
    public Bee() {
        super(60, 51);
        xSpeed = 1;
        ySpeed = 2;
        Random rand = new Random(); //随机数对象
        awardType = rand.nextInt(2); //0到1之间随机生成
    }

    /**
     * 重写step()移动
     */
    public void step() {
        x += xSpeed; //x+(向右或向左)
        y += ySpeed; //y+(向下)
        if (x <= 0 || x >= 400 - width) { //若x<=0或x>=(窗口宽-蜜蜂宽)，表示到两头了
            xSpeed *= -1; //则切换方法(正变负，负变正)
        }
    }

    int index = 1; //下标

    /**
     * 重写getImage()获取图片
     */
    public BufferedImage getImage() { //每10毫秒走一次
        if (isLive()) {
            return Images.bees[0];
        } else if (isDead()) {
            BufferedImage img = Images.bees[index++];
            if (index == Images.bees.length) {
                state = REMOVE;
            }
            return img;
        }
        return null;
    }

}
