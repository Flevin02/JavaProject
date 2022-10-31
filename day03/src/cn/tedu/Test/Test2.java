package cn.tedu.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        //声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年"。
        int year = new Scanner(System.in).nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + "年是闰年");
        else
            System.out.println(year + "年是平年");
    }
}
