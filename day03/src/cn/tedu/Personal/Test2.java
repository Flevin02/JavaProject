package cn.tedu.Personal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        //1.生成中奖号码
        int[] arr = createNumber();
        System.out.println(Arrays.toString(arr));

        //2.用户输入号码（红球+蓝球）
        int[] numArr = userInputNumber();

        //3.判断用户中奖情况
        //红球 蓝球
        int redCount = 0;
        int blueCount = 0;

        //判断红球中奖情况
        for (int i = 0; i < numArr.length - 1; i++) {
            int redNumber = numArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    //如果找到了就没有必要再比较后面的
                    //跳出内循环继续判断下一个红球是否中奖
                    break;
                }
            }
        }

        //判断蓝球中奖情况
        int blueNumber = numArr[numArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        System.out.println("有"+ redCount+"红球中奖");
        System.out.println("有"+ blueCount+"蓝球中奖");
        System.out.println("***********************");

        //根据红球个数和蓝球个数判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万！");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万！");
        }else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元！");
        }else if ((redCount == 5 && blueCount == 0)||(redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200元！");
        }else if ((redCount == 4 && blueCount == 0)||(redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10元！");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5元！");
        } else {
            System.out.println("谢谢参与");
        }


    }

    private static int[] userInputNumber() {

        //1.//1.创建数组用于添加用户输入的彩色球号码，6个红球，1个蓝球，数组长度为7
        int[] numArr = new int[7];

        //2.利用键盘录入
        Scanner in = new Scanner(System.in);
        //先让用户输入红球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球");
            int redNumber = in.nextInt();
            //redNumber(1-33),不重复的
            if (redNumber >= 1 && redNumber <= 33) {
                if (!(contains(numArr, redNumber))) {
                    //不存在，可以添加到数组中
                    numArr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在！请重新输入！");
                }
            } else {
                System.out.println("当前号码超出范围！");
            }
        }

        //让用户输入蓝球号码
        System.out.println("请输入蓝球号码");
        //1-16
        while (true) {
            int blueNumber = in.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                numArr[numArr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前号码超出范围！");
            }
        }

        return numArr;

    }

    public static int[] createNumber() {

        //1.创建数组用于添加彩色球号码，6个红球，1个蓝球，数组长度为7
        int[] arr = new int[7];

        //2.随机生成号码并添加到数组中
        //红球不能重复（1-33）
        //蓝球可以和红球号码相同（1-16）

        //生成红球号码
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;

            if (!contains(arr,redNumber)) {
                //把红球号码添加到数组中
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;

        return arr;

    }

    //判断数字在数组中是否存在
    public static boolean contains(int[] arr, int num) {

        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;

    }

}
