package cn.tedu.Personal;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        //1.定义数组表示奖池
        int[] arr = {2, 500, 888, 1000, 10000};
        //2.定义新数组存结果
        int[] newArr = new int[arr.length];

        Random r = new Random();
        //3.抽奖
        for (int i = 0; i < 5; ) {

            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];

            //判断当前奖项是否存在
            if (!(contains(newArr, prize))) {
                //把当前抽取到的奖项添加到newArr数组中
                newArr[i] = prize;
                i++;
            }
        }

        //4.遍历newArr
        String s = Arrays.toString(newArr);
        System.out.println(s);

    }
    
    //判断prize在数组中是否存在
    public static boolean contains(int[] arr, int prize) {

        for (int value : arr) {
            if (value == prize) {
                return true;
            }
        }
        return false;
    }

}
