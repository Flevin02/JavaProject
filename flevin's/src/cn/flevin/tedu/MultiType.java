package cn.flevin.tedu;

/**
 * @Project JavaProject
 * @Description 测试类
 * @Author FLevin
 * @Date 2022/10/21
 */

public class MultiType {
    public static void main(String[] args) {
        Aoo boo = new Boo();
        Boo o = (Boo) boo;
        Inter o2 = (Inter) boo;
        o2.eat();
        //Coo o3 = (Coo) boo;

        System.out.println(o);
        System.out.println(o2);
        //System.out.println(o3);
    }
}
