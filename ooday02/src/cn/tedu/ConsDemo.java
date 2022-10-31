package cn.tedu;
//构造方法的演示
public class ConsDemo {
    public static void main(String[] args) {
        //Student zs = new Student(); //编译错误，Student类没有无参构造方法
        Student zs = new Student("zhangsan",25,"LF");
        Student ls = new Student("lisi",24,"JMS");
        zs.sayHi();
        ls.sayHi();
    }
}













