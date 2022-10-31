package cn.tedu.submarine;

//整个游戏世界

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class World extends JPanel {//2.
    public static final int WIDTH = 641;//窗口的宽
    public static final int HEIGHT = 479;//窗口的高

    public static final int RUNNING = 0;
    public static final int PAUSE = -1;

    public static final int GAME_OVER = 1;
    private int state = RUNNING;

    private final Battleship ship = new Battleship();//战舰
    private SeaObject[] submarines = {};//潜艇（侦查潜艇、鱼雷潜艇、水雷潜艇）
    private Mine[] mines = {};//水雷
    private Bomb[] bombs = {};//深水炸弹

    public static void main(String[] args) {
        World world = new World();
        initJFrame(world);

        world.action();//启动程序执行

    }

    /**
     * 生成潜艇（侦查潜艇、鱼雷潜艇、水雷潜艇）对象
     */
    public SeaObject nextSubmarine() {
        Random rand = new Random();
        int type = rand.nextInt(20);
        if (type < 10) {//0-9返回侦查潜艇
            return new ObserveSubmarine();
        } else if (type < 15) {//10-14返回侦查潜艇
            return new TorpedoSubmarine();
        } else {//15-19返回水雷潜艇
            return new MineSubmarine();
        }
    }

    private int submarineEnterIndex = 0;

    /**
     * 潜艇入场
     */
    public void submarineEnterAction() {//每10毫秒走一次
        submarineEnterIndex++;
        if (submarineEnterIndex % 40 == 0) {//控制多长时间走一次
            SeaObject obj = nextSubmarine();
            submarines = Arrays.copyOf(submarines, submarines.length + 1);
            submarines[submarines.length - 1] = obj;
        }
    }


    private int mineEnterIndex = 0;
    /**
     * 雷入场
     */
    private void mineEnterAction() {
        mineEnterIndex++;
        if (mineEnterIndex % 100 == 0) {
            for (SeaObject submarine : submarines) {
                if (submarine instanceof MineSubmarine) {
                    MineSubmarine ms = (MineSubmarine) submarine;
                    Mine obj = ms.shootMine();
                    mines = Arrays.copyOf(mines, mines.length + 1);
                    mines[mines.length - 1] = obj;
                }
            }
        }
    }

    /**
     * 海洋对象移动
     */
    public void moveAction() {
        for (SeaObject submarine : submarines) {//潜艇
            submarine.move();
        }
        for (Mine mine : mines) {//水雷
            mine.move();
        }
        for (Bomb bomb : bombs) {//深水炸弹
            bomb.move();
        }
    }

    /**
     * 重写paint（）画 g：画笔
     */
    public void paint(Graphics g) {
        switch (state) {
            case GAME_OVER:
                Images.gameover.paintIcon(null, g, 0, 0);//画海洋
                break;
            case RUNNING:
                Images.sea.paintIcon(null, g, 0, 0);//画海洋
                ship.paintImage(g);
                for (SeaObject submarine : submarines) {//遍历所有潜艇
                    submarine.paintImage(g);//画潜艇
                }
                for (Mine mine : mines) {//水雷
                    mine.paintImage(g);
                }
                for (Bomb bomb : bombs) {//炸弹
                    bomb.paintImage(g);
                }
                g.drawString("SCORE:" + score, 200, 50);
                g.drawString("LIFE:" + ship.getLife(), 400, 50);
        }
    }

    /*删除越界对象*/
    public void outOfBoundsAction() {

        for (int i = 0; i < submarines.length; i++) {
            if (submarines[i].isOutOfBounds() || submarines[i].isDead()) {//出界的或者死了的
                submarines[i] = submarines[submarines.length - 1];
                submarines = Arrays.copyOf(submarines, submarines.length - 1);
            }
        }

        for (int i = 0; i < mines.length; i++) {
            if (mines[i].isOutOfBounds() || mines[i].isDead()) {
                mines[i] = mines[mines.length - 1];
                mines = Arrays.copyOf(mines, mines.length - 1);
            }
        }

        for (int i = 0; i < bombs.length; i++) {
            if (bombs[i].isOutOfBounds() || bombs[i].isDead()) {
                bombs[i] = bombs[bombs.length - 1];
                bombs = Arrays.copyOf(bombs, bombs.length - 1);
            }
        }
    }

    private int score = 0;//玩家得分

    /*深水炸弹与潜艇的碰撞*/
    public void bombBangAction() {
        for (Bomb b : bombs) {
            for (SeaObject s : submarines) {
                if (b.isLive() && s.isLive() && s.isHit(b)) {
                    b.goDEAD();//炸弹死
                    s.goDEAD();//潜艇死
                    if (s instanceof EnemyScore) {//
                        EnemyScore es = (EnemyScore) s;//将被撞潜艇强转为得分接口
                        score += es.getScore();//玩家得分
                    }
                    if (s instanceof EnemyLife) {//
                        EnemyLife el = (EnemyLife) s;//被撞潜艇强转为得命接口
                        int num = el.getLife();//获取命数
                        ship.addLife(num);//战舰增命
                    }
                }
            }
        }
    }

    /*水雷与炸弹碰撞*/
    public void mineBangAction() {
        for (Mine m : mines) {
            if (m.isLive() && ship.isLive() && m.isHit(ship)) {
                m.goDEAD();
                ship.subtractLive();
            }
        }
    }

    /*检测结束*/
    private void checkGameOverAction() {
        if (ship.getLife() <= 0) {
            state = GAME_OVER;
        }
    }

    /**
     * 启动程序的执行
     */
    public void action() {
        //添加侦听器
        this.addKeyListener(new KeyAdapter() {/*重写键盘弹起*/
            public void keyPressed(KeyEvent e) {//当按键按下时会自动执行

                if (e.getKeyCode() == KeyEvent.VK_P) {
                    if (state == RUNNING) {
                        state = PAUSE;
                    } else if (state == PAUSE) {
                        state = RUNNING;
                    }
                }


                if (e.getExtendedKeyCode() == KeyEvent.VK_SPACE) {//若按键是空格键
                    Bomb obj = ship.shoot();
                    bombs = Arrays.copyOf(bombs, bombs.length + 1);
                    bombs[bombs.length - 1] = obj;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    ship.moveLeft();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ship.moveRight();
                }
            }
        });//添加侦听

        Timer timer = new Timer();//
        int interval = 10;//
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (state == RUNNING) {
                    submarineEnterAction();//潜艇入场
                    moveAction();//海洋对象移动
                    mineEnterAction();//水雷入场
                    outOfBoundsAction();//删除越界对象
                    bombBangAction();
                    mineBangAction();
                    checkGameOverAction();
                }

                repaint();
            }
        }, interval, interval);
    }


    private static void initJFrame(World world) {
        JFrame frame = new JFrame();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH + 16, HEIGHT + 39);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//设置窗口可见 2）尽快调paint()方法
    }

}





























