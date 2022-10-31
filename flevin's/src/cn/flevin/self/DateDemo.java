package cn.flevin.self;

import java.util.Date;

/**
 * @Project JavaProject
 * @Date 2022/10/21
 * @Author FLevin
 * @Description 自定义时间类
 */

public class DateDemo {
    public static void main(String[] args) {

        Date date = new Date(0L);
        long time = date.getTime();

        time = time + 1000L * 60 * 60 * 24 * 365;

        date.setTime(time);
        System.out.println(date);
    }
}
