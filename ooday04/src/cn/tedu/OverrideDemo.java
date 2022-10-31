package cn.tedu;
//重写的演示
public class OverrideDemo {
    public static void main(String[] args) {

    }
}


//超类大，派生类小
class Aoo{
    void show(){}
    double test(){ return 0.0; }
    Boo say(){ return null; }
    Aoo sayHi(){ return null; }
}
class Boo {
    //int show(){ return 1; } //编译错误，void时必须相等
    //int test(){ return 0; } //编译错误，基本类型时必须相等
    //Aoo say(){ return null; } //编译错误，引用类型时必须小于或等于
    Boo sayHi(){ return null; } //正确
}




















