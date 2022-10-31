package cn.flevin.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @Project JavaProject
 * @Date 10/28/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 7, 4, 5);

        HashSet<Integer> setList = new HashSet<>();
        setList.addAll(list);
        System.out.println(setList);
    }
}
