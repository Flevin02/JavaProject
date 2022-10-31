package cn.flevin.test;

/**
 * @Project JavaProject
 * @Date 10/27/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test2 {
    public static Test2 t1 = new Test2();

    {
        System.out.println("BLOCKA");
    }
    static  {
        System.out.println("BLOCKB");
    }


    public static void main(String[] args) {
        Test2 t2 = new Test2();
    }
}
