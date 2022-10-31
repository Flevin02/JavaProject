package cn.flevin.self;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project JavaProject
 * @Description TODO
 * @Author FLevin
 * @Date 2022/10/21
 */

public class Pat {
    public static void main(String[] args) {
        String s = "你好Java,Java11";
        getJava(s);

    }

    private static void getJava(String s) {
        //1.获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");

        //2.获取文本匹配器对象
        Matcher m = p.matcher(s);

        //循环获取
        String str;
        while (m.find()) {
            str = m.group();
            System.out.println(str);
        }

    }
}
