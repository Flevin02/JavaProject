package cn.flevin.MemberClass;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Project JavaProject
 * @Description 主类, 游戏界面, 游戏启动
 * @Author FLevin
 * @Date 2022/10/20
 */

public class World extends JPanel {

    public static final int WIDTH = 400;  //窗口的宽
    public static final int HEIGHT = 700; //窗口的高

    //如下对象为窗口中所显示的对象
    private Sky sky = new Sky();         //天空对象
    private Hero hero = new Hero();      //英雄机对象
    private FlyingObject[] enemies = {}; //敌人(小敌机、大敌机、小蜜蜂)数组
    private Bullet[] bullets = {};       //子弹数组

    /**
     * 生成敌人(小敌机、大敌机、小蜜蜂)对象
     */
    public FlyingObject nextOne() {
        Random rand = new Random(); //随机数对象
        int type = rand.nextInt(20); //0到19之间的随机数
        if (type < 5) { //0到4时，返回小蜜蜂对象
            return new Bee();
        } else if (type < 13) { //5到12时，返回小敌机对象
            return new Airplane();
        } else { //13到19时，返回大敌机对象
            return new BigAirplane();
        }
    }

    private int enterIndex = 0; //敌人入场计数

    /**
     * 敌人入场
     */
    public void enterAction() { //每10毫秒走一次
        enterIndex++; //每10毫秒增1
        if (enterIndex % 40 == 0) { //每400(40*10)毫秒走一次
            FlyingObject obj = nextOne(); //获取敌人对象
            enemies = Arrays.copyOf(enemies, enemies.length + 1); //扩容
            enemies[enemies.length - 1] = obj; //将obj添加到enemies的最后一个元素上
        }
    }

    private int shootIndex = 0; //子弹入场计数

    /**
     * 子弹入场
     */
    public void shootAction() { //每10毫秒走一次
        shootIndex++; //每10毫秒增1
        if (shootIndex % 30 == 0) { //每300(30*10)毫秒走一次
            Bullet[] bs = hero.shoot(); //获取子弹数组对象
            bullets = Arrays.copyOf(bullets, bullets.length + bs.length); //扩容(bs有几个就扩大几个容量)
            System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length); //数组的追加
        }
    }

    /**
     * 飞行物移动
     */
    public void stepAction() { //每10毫秒走一次
        sky.step(); //天空动
        for (FlyingObject enemy : enemies) { //遍历所有敌人
            enemy.step(); //敌人动
        }
        for (Bullet bullet : bullets) { //遍历所有子弹
            bullet.step(); //子弹动
        }
    }

    /**
     * 启动程序的执行
     */
    public void action() {
        Timer timer = new Timer(); //定时器对象
        int interval = 10; //定时间隔(以毫秒为单位)
        timer.schedule(new TimerTask() {
            public void run() { //定时干的事(每10毫秒走一次)
                enterAction(); //敌人入场
                shootAction(); //子弹入场
                stepAction();  //飞行物移动
                repaint(); //重画(重新调用paint()方法)
            }
        }, interval, interval); //定时计划表
    }

    /**
     * 重写paint()画  g:画笔
     */
    public void paint(Graphics g) { //每10毫秒走一次
        g.drawImage(sky.getImage(), sky.x, sky.y, null); //画天空
        g.drawImage(sky.getImage(), sky.x, sky.getY1(), null); //画天空2
        g.drawImage(hero.getImage(), hero.x, hero.y, null); //画英雄机
        //获取每一个敌人
        for (FlyingObject f : enemies) { //遍历所有敌人
            g.drawImage(f.getImage(), f.x, f.y, null); //画敌人
        }
        //获取每一个子弹
        for (Bullet b : bullets) { //遍历所有子弹
            g.drawImage(b.getImage(), b.x, b.y, null); //画子弹
        }
    }

    private static void initJFrame(World world) {
        JFrame frame = new JFrame();
        world.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH + 16, HEIGHT + 39);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(world);
        frame.setVisible(true);
        world.action();
    }

    public static void main(String[] args) {
        World world = new World();

        initJFrame(world);
    }

}
