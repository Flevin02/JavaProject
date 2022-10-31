package cn.flevin.factory_pattern;

/**
 * @Project JavaProject
 * @Date 10/27/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test {
    public static void main(String[] args) {
        Toy t = ToyFactory.getToyName("奥特曼");
        Toy t2 = ToyFactory.getToyName("哥斯拉");

        t.name();
        t2.name();

    }
}
