package cn.flevin.self;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * @Project JavaProject
 * @Date 2022/10/21
 * @Author FLevin
 * @Description TODO
 */

public class Test5 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2000, Calendar.MARCH, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));


        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        System.out.println(ld2);
    }
}
