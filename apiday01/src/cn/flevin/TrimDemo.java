package cn.flevin;

/**
 * String trim():
 * 去除当前字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str = "       hello world            ";
        System.out.println(str); //       hello world
        str = str.trim(); //去除str两边的空白字符，并将去除之后的新的对象存储到str中
        System.out.println(str); //hello world

        String s1 = "nihao";
        String s2 = "ni";
        String s3 = "hao";
        String s4 = s2 + s3;
        String s5 = "ni" + "hao";
        String s6 = "ni" + s3;
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
    }
}



















