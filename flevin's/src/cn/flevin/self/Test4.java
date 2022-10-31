package cn.flevin.self;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @Project JavaProject
 * @Date 2022/10/21
 * @Author FLevin
 * @Description 计算自己活了多少天
 */

public class Test4 {
    public static void main(String[] args) throws ParseException {

        //计算生日的毫秒
        String birthday = "1998-07-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long birthTime = sdf.parse(birthday).getTime();

        //获取当前时间的毫秒
        long currentTime = System.currentTimeMillis();

        long time = currentTime - birthTime;

        System.out.println(time / 1000 / 3600 / 24);


        LocalDate ld = LocalDate.of(1998, 7, 18);
        LocalDate ldNow = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld, ldNow);
        System.out.println(days);

    }
}
