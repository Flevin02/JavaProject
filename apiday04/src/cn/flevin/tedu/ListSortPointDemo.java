package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序Point类型
 */
public class ListSortPointDemo {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,8));
        list.add(new Point(15,28));
        list.add(new Point(99,66));
        list.add(new Point(45,23));
        list.add(new Point(63,9));
        list.add(new Point(1,4));
        System.out.println("list原始数据:"+list);

        //JDK1.8，List集合自身提供了sort()方法进行排序，sort()方法依然需要传入比较器
        list.sort(new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2; //升序
            }
        });
        System.out.println("list排序后数据:"+list);









        /*
        Collections.sort(list, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                //return len1-len2; //升序
                return len2-len1; //降序

                //return o1.getX()-o2.getX(); //按x坐标升序
                //return o2.getY()-o1.getY(); //按y坐标降序
            }
        });
        System.out.println("list排序后数据:"+list);
         */
    }
}

















