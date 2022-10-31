package cn.flevin.tedu;
//接口的演示
public class InterfaceDemo {
    public static void main(String[] args) {
        //Inter5 o = new Inter5(); //编译错误，接口不能被实例化
        Inter5 o1 = new Doo(); //向上造型
        Inter4 o2 = new Doo(); //向上造型
    }
}

//演示接口继承接口
interface Inter4{
    void show();
}
interface Inter5 extends Inter4{
    void test();
}
class Doo implements Inter5{
    public void test(){}
    public void show(){}
}

//演示接口的多实现
interface Inter2{
    void show();
}
interface Inter3{
    void test();
}
abstract class Boo{
    abstract void say();
}
class Coo extends Boo implements Inter2,Inter3{
    public void show(){}
    public void test(){}
    void say(){}
}

//演示接口的实现
interface Inter1{
    void show();
    void test();
}
class Aoo implements Inter1{
    public void show(){} //重写接口中的抽象方法，必须加public
    public void test(){}
}

//演示接口的定义
interface Inter{
    public static final int NUM = 5;
    public abstract void show();
    int COUNT = 6; //默认public static final
    void test(); //默认public abstract
    //int number; //编译错误，常量必须声明同时初始化
    //void say(){} //编译错误，抽象方法不能有方法体
}















