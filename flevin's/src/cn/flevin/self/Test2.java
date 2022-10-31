package cn.flevin.self;

/**
 * @Project JavaProject
 * @Date 2022/10/21
 * @Author FLevin
 * @Description 实现pareInt效果, 将字符串形式的数据转成整数
 * 字符串只能有数字,最少一位,最多十位,0不能开头
 */

public class Test2 {
    public static void main(String[] args) {
        String str = "412413212";

        if (checkStr(str)) {
            System.out.println(getNum(str));
        } else {
            System.out.println("数据格式有误");
        }

    }

    //将字符串转为数字
    public static int getNum(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + str.charAt(i) - '0';
        }
        return num;
    }

    //数据格式检查
    public static boolean checkStr(String str) {
        return str.matches("[1-9]\\d{0,9}");
    }

}
