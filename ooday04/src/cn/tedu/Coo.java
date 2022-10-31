package cn.tedu;
//访问控制修饰符的演示
public class Coo {
    public int a;    //任何类
    protected int b; //本类、派生类、同包类
    int c;           //本类、同包类
    private int d;   //本类

    public void show(){
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }
}

class Doo{ //----------------------演示private
    public void show(){
        Coo o = new Coo();
        o.a = 1;
        o.b = 2;
        o.c = 3;
        //o.d = 4; //编译错误
    }
}














