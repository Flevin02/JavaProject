package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合的演示
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list:"+list); //[one, two, three, four, five]

        /**
         * E get(int index):
         * 获取指定下标所对应的元素
         */
        String e = list.get(2); //获取第3个元素
        System.out.println(e); //three

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String s : list){
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------------------");

        /*
          E set(int index,E e):
          将给定元素(e)设置到给定位置(index)，返回被替换的元素
         */
        String old = list.set(2,"six"); //将下标为2的元素设置为six，返回原始元素
        //list.set(2,"six"); //常规用法
        System.out.println(old);  //three
        System.out.println("list:"+list); //[one, two, six, four, five]

        /**
         * void add(int index, E e):
         * 将给定元素e添加到index所指定的位置，相当于插入操作
         */
        list.add(3,"three"); //将three插入到下标3的位置
        System.out.println("list:"+list); //[one, two, six, three, four, five]

        /**
         * E remove(int index):
         * 删除指定位置元素，并返回该位置对应元素
         */
        String o = list.remove(2); //删除下标2的元素，并返回对应元素
        System.out.println(o); //six
        System.out.println("list:"+list); //[one, two, three, four, five]

    }
}

















