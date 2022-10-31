package cn.flevin.self;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Project JavaProject
 * @Date 2022/10/21
 * @Author FLevin
 * @Description 键盘录入1-100的整数并添加到集合中,直到集合中的数据和超过200
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        while (sum <= 200) {

            System.out.println("请输入1-100之间的整数");
            //在添加数据的时候触发了自动装箱
            list.add(Integer.parseInt(in.nextLine()));

            //统计集合的数据和
            sum = getSum(list);

        }
        System.out.println("和为" + sum);

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
