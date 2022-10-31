package cn.tedu;

public class Demo1 {
    public static void main(String[] args) {

        int a = 5, b = 10, c = 5;
        boolean flag = b >= a && b < c;
        System.out.println(flag);
        System.out.println(b <= c && b >= a);


        String s = "hello";
        String g = s.concat("s");
        System.out.println(g);

    }
}
