package cn.tedu;

//static的演示
public class StaticDemo {
    public static void main(String[] args) {
        Goo o1 = new Goo();
        o1.show();
        Goo o2 = new Goo();
        o2.show();
        Goo o3 = new Goo();
        o3.show();
        System.out.println(Goo.b); //常常通过类名点来访问

        Hoo.test(); //常常通过类名点来访问

        Joo o4 = new Joo();
        Joo o5 = new Joo();
        Joo o6 = new Joo();
    }
}

//演示静态块
class Joo{
    static{
        System.out.println("静态块");
    }
    Joo(){
        System.out.println("构造方法");
    }
}












//演示静态方法何时用
class Ioo{
    int a; //对象的属性

    //show()方法中访问了对象的属性a，意味着show()方法与对象有关，所以不适合设计为静态方法
    void show(){
        System.out.println(a);
    }
    //plus()方法中没有访问对象的属性/对象的行为，意味着plus()方法与对象无关，可以设计为静态方法
    int plus(int num1,int num2){
        int num = num1+num2;
        return num;
    }
}













//演示静态方法
class Hoo{
    int a; //实例变量(由对象来访问)
    static int b; //静态变量(由类名来访问)
    void show(){ //有隐式this
        System.out.println(this.a);
        System.out.println(Hoo.b);
    }
    static void test(){ //没有隐式this
        //静态方法中没有隐式this传递，
        //没有this就意味着没有对象，
        //而实例变量a是必须通过对象来访问的，
        //所以如下语句发生编译错误
        //System.out.println(a); //编译错误
        System.out.println(Hoo.b);
    }
}





















//演示静态变量
class Goo{
    int a;
    static int b;
    Goo(){
        a++;
        b++;
    }
    void show(){
        System.out.println(a+","+b);
    }
}















