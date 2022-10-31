package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set集:不可重复集合、并且无序
 */
public class SetDemo {
    public static void main(String[] args) {
        //小面试题:如何去重?
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("two");
        System.out.println("list:"+list);

        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println("set:"+set);
        
        /*
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("two");
        System.out.println(set);
         */
    }
}


















