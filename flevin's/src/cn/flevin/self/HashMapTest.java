package cn.flevin.self;

import java.util.*;

/**
 * @Project JavaProject
 * @Date 10/24/2022
 * @Author FLevin
 * @Description TODO
 */

public class HashMapTest {
    public static void main(String[] args) {
        //定义数组存储景点
        String[] arr = {"A", "B", "C", "D"};

        //模拟投票并存储在集合中
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //利用Map集合进行统计
        HashMap<String, Integer> map = new HashMap<>();

        for (String scenicName : list) {
            //判断当前的景点在集合中是否存在
            if (map.containsKey(scenicName)) {
                //存在
                //先获取当前景点已经被投票的次数
                int count = map.get(scenicName);
                //表示当前节点新增一次
                count++;
                map.put(scenicName, count);
            } else {
                //不存在
                map.put(scenicName, 1);
            }
        }
        System.out.println(map);

        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        //判断哪个景点的次数与最大值相同
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}
