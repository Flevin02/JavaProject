package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的演示
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        c.add(new Point(1,2));
        System.out.println(c);

        Point p = new Point(1,2);
        /**
         * boolean contains(Object o)
         * 判断当前集合是否包含给定元素(o)
         * 判断依据是给定元素是否与集合元素存在equals比较为true的情况
         */
        boolean contains = c.contains(p);
        System.out.println("是否包含:"+contains);

        /**
         * boolean remove(Object o)
         * 从当前集合中删除与给定元素equals比较为true的元素
         * 若存在重复元素则只删除一次
         */
        c.remove(p);
        System.out.println(c);


        //集合中存放的是元素的引用
        Collection cc = new ArrayList();
        Point pp = new Point(1,2);
        cc.add(pp); //将pp添加到集合c中----将pp的引用装在了cc中
        System.out.println("pp:"+pp); //(1,2)
        System.out.println("cc:"+cc); //[(1,2)]

        pp.setX(100);
        System.out.println("pp:"+pp); //(100,2)
        System.out.println("cc:"+cc); //[(100,2)]









        /*
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        //集合中重写了Object的toString()方法，格式如下:
        //[元素1.toString(), 元素2.toString(), 元素3.toString(), ......]
        System.out.println(c);
        System.out.println("size:"+c.size()); //5，输出集合的元素个数
        //isEmpty()判断集合是否是空集(size()为0表示为空集)
        System.out.println("是否是空集:"+c.isEmpty()); //false

        c.clear(); //清空集合
        System.out.println("集合已清空");
        System.out.println(c);
        System.out.println("size:"+c.size()); //0
        System.out.println("是否为空集:"+c.isEmpty()); //true
        */
    }
}















