package cn.flevin.args;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Project JavaProject
 * @Date 10/26/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> listBoy = new ArrayList<>();
        Collections.addAll(listBoy, "zhang san", "li si", "wang wu", "zhao liu");
        Collections.shuffle(listBoy);

        ArrayList<String> listGirl = new ArrayList<>();
        Collections.addAll(listGirl, "qian qi", "shi shi", "meng meng");
        Collections.shuffle(listGirl);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Collections.shuffle(list2);

        if (list2.get(0) == 1) {
            System.out.println(listBoy.get(0));
        } else {
            System.out.println(listGirl.get(0));
        }

    }
}
