package cn.flevin.self;

/**
 * @Project JavaProject
 * @Date 2022/10/21
 * @Author FLevin
 * @Description 将十进制整数转成字符串表示的二进制
 */

public class Test3 {
    public static void main(String[] args) {

        String str = toBinaryStr(123);
        System.out.println(str);
        System.out.println(Integer.toBinaryString(123));

    }

    public static String toBinaryStr(int num) {

        //不断除以2直到商为0,然后将余数倒着拼接
        StringBuilder sb = new StringBuilder();

        while (num != 0) {

            //获取余数
            int result = num % 2;
            sb.insert(0, result);
            //除以2
            num = num / 2;

        }

        return sb.toString();
    }

}
