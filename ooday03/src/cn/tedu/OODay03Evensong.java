package cn.tedu;
public class OODay03Evensong {
    public static void main(String[] args) {
    }
}

/*
潜艇游戏第三天:
1.设计侦察潜艇数组、鱼雷潜艇数组、水雷潜艇数组、水雷数组、深水炸弹数组，并测试
2.设计SeaObject超类，6个类继承超类
3.给SeaObject设计两个构造方法，6个类分别调用
4.将侦察潜艇数组、鱼雷潜艇数组、水雷潜艇数组组合为SeaObject超类数组，并测试
*/
//练习顺序: 2、3、(1+4)










/*
1)一个文件中建议只建一个类，类一定要单独创建
  ----发的问题中必须是分开放置的类
2)为何超类设计两个构造方法被派生类调用?
  2.1)两个参构造是给侦察潜艇、鱼雷潜艇、水雷潜艇使用的
      ----因为三种潜艇的x/y/speed都是相同的，所以只需传宽和高即可
  2.2)五个参构造是给战舰、水雷、深水炸弹使用的
      ----因为这3种对象的宽/高/x/y/speed都是不同的，所以得传5个参数
3)继承要符合is a(是一个)的关系
  ----继承不能乱用，不能仅仅为了复用某代码就乱继承
  ----类间的关系有很多种(继承、关联、组合、聚合...)，继承只是其中的一种，后续再慢慢讲
4)能继承的是超类中的成员变量和普通方法，而不包括构造方法
  ----超类的构造方法是被派生类通过super来调用的
  class Aoo{
    int a; //成员变量
    Aoo(){ //构造方法
    }
    void show(){ //普通方法
    }
  }
  class Boo extends Aoo{
    继承的是Aoo中的成员变量a和普通方法show()，而不包括构造方法Aoo()
    构造方法Aoo()是派生类中通过super()来调用的
  }
5)问:width,height等的值为什么都是0?
  class SeaObject{
    int width;
    int height; //成员变量
    ....
    SeaObject(int width,int height,int x,int y,int speed){
        width = width;   //给局部变量width赋值，应改为--this.width=width;
        height = height; //给局部变量height赋值，应改为--this.height=height;
        ......
    }
  }
6)引用类型数组元素赋值:
    Mine[] ms = new Mine[3];
    ms[0] = new Mine(100,200);
    ms[1] = new Mine(200,300);
    ms[2] = new Mine(300,400);

    Mine[] ms = new Mine[]{
      new Mine(100,200),
      new Mine(200,300),
      new Mine(300,400)
    };
7)构造方法:
    public class ooDay03 {
      public static void main(String[] args) {
        TestA o = new TestA(); //调用构造方法
        o.TestA(); //调用普通方法
      }
    }
    class TestA{      //练习
      TestA(){
        System.out.println("构造方法");
      }
      void TestA(){
        System.out.println("普通方法");
      }
    }
*/















