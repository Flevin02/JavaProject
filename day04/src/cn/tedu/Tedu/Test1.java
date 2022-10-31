package cn.tedu.Tedu;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 20 + 1);

        Scanner in = new Scanner(System.in);
        /*System.out.println("猜吧");
        int guess = in.nextInt();
        while (guess != num) {

            if (guess > num) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }

            guess = in.nextInt();

        }
        System.out.println("猜对了");*/

        int guess;
        do {
            System.out.println("猜吧");
            guess = in.nextInt();
            if (guess > num) {
                System.out.println("猜大了");
            } else if (guess < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
            }
        } while (guess != num);
    }
}
