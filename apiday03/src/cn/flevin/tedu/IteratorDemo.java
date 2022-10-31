package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历---迭代器Iterator
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c); //[one, #, two, #, three, #, four, #, five]

        /**
         * 迭代器的常用方法:
         * 1)boolean hasNext()----------问
         *   询问集合是否还有"下一个"元素可供迭代
         *   注意:迭代器默认开始位置在集合第1个元素之前
         *       无论调用多少次hasNext()方法，迭代器的位置都不会改变
         * 2)Object next()--------------取
         *   迭代器向后移动一个位置来指向集合的下一个元素并将其获取
         */
        Iterator it = c.iterator(); //获取集合c的迭代器
        while(it.hasNext()){ //若有下一个元素
            String str = (String)it.next(); //获取下一个元素
            System.out.println(str);
            if("#".equals(str)){ //若str为#号
                //c.remove(str); //迭代器遍历过程中不能通过集合的方法增删元素的，否则会报异常
                it.remove(); //删除next()方法所获取的元素
            }
        }
        System.out.println(c);
    }
}














