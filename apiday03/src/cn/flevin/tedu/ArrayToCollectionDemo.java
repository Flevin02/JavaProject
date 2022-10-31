package cn.flevin.tedu;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合:
 */
public class ArrayToCollectionDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+Arrays.toString(array));

        //asList()方法会返回内部的ArrayList
        //该ArrayList内部直接引用给定数组array
        List<String> list = Arrays.asList(array);
        System.out.println("List: "+list);

        //对数组操作后，集合也会做相应的改变
        array[1] = "six";
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("List: "+list);

        //对集合操作后，数组也会做相应的改变
        list.set(2,"seven"); //将下标2的元素修改为seven---明天详细讲
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("List: "+list);

        //添加元素/删除元素相当于要往数组中加元素/减元素
        //而数组是定长的，不会自动扩容/缩容，因此会发生不支持操作的异常
        //list.add("!!!!!!"); //运行时发生不支持操作异常
    }
}
















