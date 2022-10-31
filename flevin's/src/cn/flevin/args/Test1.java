package cn.flevin.args;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Project JavaProject
 * @Date 10/26/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhang san", "li si", "wang wu", "zhao liu");

        /*Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);*/

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
