package cn.flevin.tedu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增强型for循环:新循环
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //新循环遍历数组---会被编译器改为普通的for循环
        for(String str : array){
            System.out.println(str);
        }

        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        Iterator it = c.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
        //新循环遍历集合----会被编译器改为迭代器遍历
        for(Object obj : c){
            String str = (String)obj;
            System.out.println(str);
        }

    }
}


















