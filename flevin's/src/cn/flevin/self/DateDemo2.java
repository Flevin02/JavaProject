package cn.flevin.self;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Project JavaProject
 * @Date 2022/10/21
 * @Author FLevin
 * @Description TODO
 */

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String str = sdf.format(new Date());
        System.out.println(str);

        String str2 = "2022-11-11 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat(str2);
        Date parse = sdf2.parse(str2);
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd");
        String result = sdf3.format(new Date());
        System.out.println(result);
    }
}
