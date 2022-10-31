package cn.flevin.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * 游戏主界面
 */
public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建二维数组,管理数据
    int[][] data = new int[4][4];

    //记录0号label的坐标
    int x = 0, y = 0;

    //定义二维数组存储正确的数据
    int[][] correctArr = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8,},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义变量记录图片路径
    String bacImgPath = "puzzlegame/image/background.png";
    String imgPath = "puzzlegame/image/animal/animal1/";

    //定义变量记录步数
    int step = 0;

    //创建选项的条目对象,并添加到菜单
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeGameItem = new JMenuItem("关闭游戏");
    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    JMenuItem accountItem = new JMenuItem("公众号");

    //创建一个随机对象
    Random r = new Random();

    public GameJFrame() {

        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenu();

        //初始化数据
        initData();

        //初始化图片
        initImage();

        //显示界面
        this.setVisible(true);
    }

    //初始化数据
    private void initData() {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];
        }

    }

    //初始化图片
    //添加图片时按照二维数组中的数据添加
    private void initImage() {
        //清空已经出现的所有图片
        this.getContentPane().removeAll();

        if (win()) {
            //显示胜利的图片
            JLabel winLabel = new JLabel(new ImageIcon("puzzlegame/image/win.png"));

            winLabel.setBounds(164, 250, 197, 73);

            this.getContentPane().add(winLabel);
        }

        JLabel viewStep = new JLabel("步数:" + step);
        viewStep.setBounds(10, 8, 100, 20);
        this.getContentPane().add(viewStep);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int num = data[i][j];

                //创建图片ImageIcon对象
                //创建JLabel对象
                JLabel label = new JLabel(new ImageIcon(imgPath + num + ".jpg"));

                //指定图片位置
                label.setBounds(105 * j + 44, 105 * i + 101, 105, 105);
                label.setBorder(new BevelBorder(BevelBorder.RAISED));

                //添加JLabel到界面
                this.getContentPane().add(label);

            }
        }

        //添加图片背景
        JLabel bacImag = new JLabel(new ImageIcon(bacImgPath));
        bacImag.setBounds(0, 0, 508, 560);
        this.getContentPane().add(bacImag);

        //刷新界面
        this.getContentPane().repaint();

    }

    //初始化菜单
    private void initJMenu() {

        //初始化菜单
        //创建整个菜单对象
        JMenuBar gameMenuBar = new JMenuBar();
        //创建菜单选项
        JMenu function = new JMenu("功能");//功能选项
        JMenu about = new JMenu("关于我们");//关于选项
        JMenu changImg = new JMenu("更换图片");

        //将条目添加到选项中
        changImg.add(girlItem);
        changImg.add(animalItem);
        changImg.add(sportItem);

        //把更换图片，重新游戏，重新登录，关闭游戏添加到功能当中
        function.add(changImg);
        function.add(replayItem);
        function.add(reLoginItem);
        function.add(closeGameItem);
        //把公众号添加到关于我们当中
        about.add(accountItem);

        //给选项条目创建事件绑定
        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeGameItem.addActionListener(this);
        accountItem.addActionListener(this);

        //把功能，关于我们添加到JMenuBar当中
        gameMenuBar.add(function);
        gameMenuBar.add(about);

        //给整个界面设置菜单
        this.setJMenuBar(gameMenuBar);
    }

    //初始化界面
    private void initJFrame() {

        //设置界面的宽高
        this.setSize(525, 623);

        //设置界面标题
        this.setTitle("拼图游戏V1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置
        setLayout(null);

        //给整个界面添加键盘监听事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时会显示完整图片
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //删除界面的所有图片
            this.getContentPane().removeAll();

            //加载完整图片
            JLabel completeImg = new JLabel(new ImageIcon(imgPath + "all.jpg"));
            completeImg.setBounds(44, 101, 420, 420);
            this.getContentPane().add(completeImg);

            //加载背景图片
            //添加图片背景
            JLabel bacImag = new JLabel(new ImageIcon(bacImgPath));
            bacImag.setBounds(0, 0, 508, 560);
            this.getContentPane().add(bacImag);

            //刷新界面
            this.getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        //判断胜利后
        if (win()) {
            return;
        }

        //对上 下 左 右进行判断
        //  38 40 37 39
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            if (x == 3) {
                //表示空白方块在最下方
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0},
            };
            initImage();
        }
    }

    //判断是否获胜
    public boolean win() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != correctArr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayItem) {
            //重新打乱数据
            initData();

            //清零计数器
            step = 0;

            //重新加载图片
            initImage();

            this.getContentPane().repaint();

        } else if (source == reLoginItem) {

            //关闭当前界面
            this.setVisible(false);

            //返回登录界面
            new LoginJFrame();

        } else if (source == closeGameItem) {
            //关闭游戏
            System.exit(0);
        } else if (source == accountItem) {
            getDialog();
        } else if (source == girlItem) {
            int girlNum = r.nextInt(13) + 1;
            //生成随机文件后缀数字
            imgPath = "puzzlegame/image/girl/girl" + girlNum + "/";

            //清零计数器
            step = 0;

            //重新初始化数据
            initData();

            //重新加载图片
            initImage();

            this.getContentPane().repaint();
        } else if (source == animalItem) {
            int animalNum = r.nextInt(8) + 1;
            //生成随机文件后缀数字
            imgPath = "puzzlegame/image/animal/animal" + animalNum + "/";

            //清零计数器
            step = 0;

            //重新初始化数据
            initData();

            //重新加载图片
            initImage();

            this.getContentPane().repaint();
        } else if (source == sportItem) {
            int sportNum = r.nextInt(10) + 1;
            //生成随机文件后缀数字
            imgPath = "puzzlegame/image/sport/sport" + sportNum + "/";

            //清零计数器
            step = 0;

            //重新初始化数据
            initData();

            //重新加载图片
            initImage();

            this.getContentPane().repaint();
        }
    }

    //获取弹窗
    public void getDialog() {
        //创建弹窗对象
        JDialog log = new JDialog(this, "公众号");

        //创建管理图片的对象
        JLabel label = new JLabel(new ImageIcon("puzzlegame/image/about.png"));

        //设置位置和宽高
        label.setBounds(0, 0, 258, 258);

        log.getContentPane().add(label);

        //设置大小
        log.setSize(340, 340);

        //设置置顶
        log.setAlwaysOnTop(true);

        //居中显示
        log.setLocationRelativeTo(null);

        //弹窗不关闭则无法操作下面的操作
        log.setModal(true);

        //可视
        log.setVisible(true);
    }

}
