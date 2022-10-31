package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List提供了获取子集的操作:
 * List subList(int start,int end):含头不含尾
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i*10);
        }
        System.out.println("list:"+list); //[0, 10, 20, 30, 40, 50, 60, 70, 80, 90]

        List<Integer> subList = list.subList(3,8); //获取下标3到7的子集
        System.out.println("subList:"+subList); //[30, 40, 50, 60, 70]

        //将子集的每个元素扩大10倍
        for(int i=0;i<subList.size();i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println("subList:"+subList); //[300, 400, 500, 600, 700]
        //注意:对子集的操作就是对原集合元素的操作
        System.out.println("list:"+list); //[0, 10, 20, 300, 400, 500, 600, 700, 80, 90]

        list.set(3,3000); //将下标为3的元素修改为3000
        System.out.println("list:"+list); //[0, 10, 20, 3000, 400, 500, 600, 700, 80, 90]
        System.out.println("subList:"+subList); //3000, 400, 500, 600, 700

        list.remove(0); //删除list中的第1个元素
        System.out.println("list:"+list); //[10, 20, 3000, 400, 500, 600, 700, 80, 90]
        //原集合修改之后，子集将不能再进行任何操作了，操作则发生并发修改异常，但是可以重新获取子集
        //System.out.println("subList:"+subList); //运行时并发修改发生异常

        /**
         * java.util.Collections为集合的工具类，包含了集合相关的静态方法
         */
        Collections.reverse(list); //反转list集合(元素真实改变了)
        System.out.println("lisi:"+list);

    }
}




























