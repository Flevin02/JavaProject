package cn.flevin.args;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @Project JavaProject
 * @Date 10/26/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhang san", "li si", "wan wu", "zhao liu");

        //创建一个临时的集合存储被删除的姓名
        ArrayList<String> tempList = new ArrayList<>();
        Random r = new Random();
        //循环两轮
        for (int i = 0; i < 2; i++) {
            while (!list.isEmpty()) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                tempList.add(name);
                System.out.println(name);
            }
            list.addAll(tempList);
            tempList.clear();
        }
    }
}
