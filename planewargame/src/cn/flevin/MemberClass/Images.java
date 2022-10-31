package cn.flevin.MemberClass;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

/**
 * @Project JavaProject
 * @Description 图片类, 初始化图片
 * @Author FLevin
 * @Date 2022/10/20
 */

public class Images {
    public static BufferedImage start;    //启动图片
    public static BufferedImage pause;    //暂停图片
    public static BufferedImage gameover; //游戏结束图片
    public static BufferedImage sky;      //天空图片
    public static BufferedImage bullet;   //子弹图片
    public static BufferedImage[] heros;  //英雄机图片数组
    public static BufferedImage[] airs;   //小敌机图片数组
    public static BufferedImage[] bairs;  //大敌机图片数组
    public static BufferedImage[] bees;   //小蜜蜂图片数组

    static { //给图片赋值
        start = readImage("planewargame/img/start.png");
        pause = readImage("planewargame/img/pause.png");
        gameover = readImage("planewargame/img/gameover.png");
        sky = readImage("planewargame/img/background.png");
        bullet = readImage("planewargame/img/bullet.png");
        heros = new BufferedImage[2]; //2张图片
        heros[0] = readImage("planewargame/img/hero0.png");
        heros[1] = readImage("planewargame/img/hero1.png");

        airs = new BufferedImage[5]; //5张图片
        bairs = new BufferedImage[5]; //5张图片
        bees = new BufferedImage[5]; //5张图片
        airs[0] = readImage("planewargame/img/airplane.png");
        bairs[0] = readImage("planewargame/img/bigairplane.png");
        bees[0] = readImage("planewargame/img/bee.png");
        for (int i = 1; i < airs.length; i++) { //赋值爆破图
            airs[i] = readImage("planewargame/img/bom" + i + ".png");
            bairs[i] = readImage("planewargame/img/bom" + i + ".png");
            bees[i] = readImage("planewargame/img/bom" + i + ".png");
        }
    }

    /**
     * 读取图片  fileName:图片名称
     */
    public static BufferedImage readImage(String fileName) {
        try {
            return ImageIO.read(new FileInputStream(fileName)); //读取与FlyingObject同包中的图片
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        System.out.println(Images.bees.length); //测试代码只要用到Images类就OK
    }
}
