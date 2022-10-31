package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 字符串集合的排序
 */
public class ListSortStringDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王克晶");
        list.add("传奇djflajfdl");
        list.add("苍松老师");
        System.out.println("list原始数据:"+list);
        Collections.sort(list, new Comparator<String>() {
            /*
              compare()方法用于定义o1和o2比较大小的规则，并用返回值表达大小关系
              返回值实现的要求:-------不用纠结，去记下面的结论即可
              1)如果返回值>0，则表达的是o1>o2
              2)如果返回值<0，则表达的是o1<o2
              3)如果返回值=0，则表达的是o1=o2
              结论:
                1)前面的(o1)-后面的(o2)-----------升序
                2)后面的(o2)-前面的(o1)-----------降序
             */
            public int compare(String o1, String o2) {
                return o1.length()-o2.length(); //升序
                //return o2.length()-o1.length(); //降序
            }
        });
        System.out.println("list排序后数据:"+list);












        /*
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("rose");
        list.add("tom");
        list.add("jerry");
        list.add("black");
        list.add("Kabe");
        System.out.println("list原始数据: "+list);
        //对英文字符串排序时，会按首字母的ASCII码排序
        //若首字母相同，则比较第2个字符的ASCII码，以此类推
        Collections.sort(list);
        System.out.println("list排序后数据:"+list);
         */

    }
}
















