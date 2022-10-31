package cn.tedu;
import ooday04.Coo;
public class Eoo { //------------------演示同包的
    public void show(){
        Coo o = new Coo();
        o.a = 1;
        //o.b = 2; //编译错误
        //o.c = 3; //编译错误
        //o.d = 4; //编译错误
    }
}

class Foo extends Coo{ //跨包继承------------演示protected
    public void show(){
        a = 1;
        b = 2;
        //c = 3; //编译错误
        //d = 4; //编译错误
    }
}















