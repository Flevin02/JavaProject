package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序
 */
public class ListSortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i=0;i<10;i++){
            list.add(rand.nextInt(100));
        }
        System.out.println("list原始数据:"+list);

        Collections.sort(list); //对list集合进行自然排序(从小到大)
        System.out.println("list排序后数据:"+list);

        Collections.reverse(list); //反转list集合(数据已经变化了)
        System.out.println("list反转后:"+list);
    }
}

















