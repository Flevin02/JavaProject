package cn.flevin.test;

/**
 * @Project JavaProject
 * @Date 10/28/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test {
    {//语句块
        System.out.println("blockA");
    }

    static {//静态块
        System.out.println("blockB");
    }

    public static Test t1 = new Test();

    public Test() {//构造方法
        System.out.println("blockC");
    }

    public static void main(String[] args) {
        Test t2 = new Test();
    }
}
