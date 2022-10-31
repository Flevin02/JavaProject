package cn.tedu.Tedu;

import java.util.Scanner;

public class ScoreLevel {
    public static void main(String[] args) {

        int score = new Scanner(System.in).nextInt();
        System.out.println("请输入成绩:");
        if (score < 0 || score > 100) {
            System.out.println("成绩超出范围!重新输入");
        } else if (score >= 90) { //合法
            System.out.println("A-优秀");
        } else if (score >= 80) {
            System.out.println("B-良好");
        } else if (score >= 60) {
            System.out.println("C-中等");
        } else {
            System.out.println("D-不及格");
        }

    }
}
