package cn.tedu;

//多态的演示
public class MultiTypeDemo {
    public static void main(String[] args) {
        //条件1:引用所指向的对象，就是该类型
        //条件2:引用所指向的对象，实现了该接口或继承了该类
        Aoo o = new Boo();
        Boo o1 = (Boo) o; //符合条件1---引用o所指向的对象，就是Boo类型
        Inter o2 = (Inter) o; //符合条件2---引用o所指向的对象，实现了Inter接口
        //Coo o3 = (Coo)o; //运行时会发生ClassCastException类型转换异常
        if (o instanceof Boo) { //后期业务中只要强转，在强转之前必须先instanceof判断
            Boo o4 = (Boo) o;
            System.out.println(o4.a);
            System.out.println(o4.b);
        } else {
            System.out.println("o不是Coo类型");
        }
        if (o instanceof Inter) { //后期业务中只要强转，在强转之前必须先instanceof判断
            Inter o5 = (Inter) o;
            System.out.println(o5.i);
        } else {
            System.out.println();
        }

        System.out.println(o instanceof Boo);   //true
        System.out.println(o instanceof Inter); //true
        System.out.println(o instanceof Coo);   //false
    }
}

interface Inter {
    final String i = "inter";
}

class Aoo {
    String a = "a";
}

class Boo extends Aoo implements Inter {
    String b = "b";
}

class Coo extends Aoo {
    String c = "c";
}












