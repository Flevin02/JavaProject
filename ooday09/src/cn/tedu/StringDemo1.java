package cn.tedu;

/**
 * @Project JavaProject
 * @Date 10/24/2022
 * @Author FLevin
 * @Description string
 */

public class StringDemo1 {
    /**
     *使用""创建字符串对象时,JVM会检查常量池中是否有该对象
     * 若无,会创建字符串对象,并引入到常量池中
     * 若有,会将常量池中的对象返回,不会创建新的对象
     */
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "1";
        String s3 = "23";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        String s = "1" + "23";
        String s4 = s2 + "23";
        System.out.println(s == s4);

    }
}
