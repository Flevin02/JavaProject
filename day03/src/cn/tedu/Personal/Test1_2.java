package cn.tedu.Personal;

import java.util.Arrays;
import java.util.Random;

public class Test1_2 {
    public static void main(String[] args) {

        //1.创建奖金池，并打乱顺序
        int[] arr = {2, 500, 888, 1000, 10000};
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {

            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }
}
