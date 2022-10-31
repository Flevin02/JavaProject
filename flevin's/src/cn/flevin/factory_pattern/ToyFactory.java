package cn.flevin.factory_pattern;

/**
 * @Project JavaProject
 * @Date 10/27/2022
 * @Author FLevin
 * @Description TODO
 */

public class ToyFactory {
    public static Toy getToyName(String toy) {
        if (toy.equals("哥斯拉")) {
            return new Godzilla();
        } else if (toy.equals("奥特曼")) {
            return new Ultraman();
        } else {
            return null;
        }
    }
}
