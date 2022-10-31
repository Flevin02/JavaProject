package cn.tedu.Tedu;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 20 + 1);
        Scanner in = new Scanner(System.in);

        int guess;
        do {
            System.out.print("请输入数字:");
            guess = in.nextInt();

            if (guess > num) {
                System.out.println("太大了");
            } else if (guess < num) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你猜对了");
            }
        } while (guess != num);

    }
}
