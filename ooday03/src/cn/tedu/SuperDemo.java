package cn.tedu;
//super的演示
public class SuperDemo {
    public static void main(String[] args) {
        Doo o = new Doo();
    }
}


class Eoo{
    Eoo(int a){
    }
}
class Foo extends Eoo{
    Foo(){
        super(5); //调用Eoo的有参构造方法
    }
    /*
    //如下代码为默认的
    Foo(){
        super();
    }
     */
}














class Coo{
    Coo(){
        System.out.println("超类构造方法");
    }
}
class Doo extends Coo{
    Doo(){
        super(); //默认的，调用超类的无参构造方法
        System.out.println("派生类构造方法");
    }
}



















