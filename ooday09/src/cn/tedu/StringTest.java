package cn.tedu;

/**
 * @Project JavaProject
 * @Date 10/24/2022
 * @Author FLevin
 * @Description 面向对象练习
 */

public class StringTest {
    public static void main(String[] args) {

        //超类静态语句块 超类语句块 超类构造方法
        //Aoo a1 = new Aoo();

        //超类静态语句块 子类静态块 超类语句块 超类构造方法 子类语句块 子类构造方法
        //Boo b1 = new Boo();

        //超类静态语句块 子类静态块 超类语句块 超类构造方法 子类语句块 子类构造方法
        //Aoo a2 = new Boo();
    }
}

class Aoo {
    static {
        System.out.println("超类静态语句块");
    }

    {
        System.out.println("超类语句块");
    }

    Aoo() {
        System.out.println("超类构造方法");
    }
}

class Boo extends Aoo {
    static {
        System.out.println("子类静态块");
    }

    {
        System.out.println("子类语句块");
    }

    Boo() {
        System.out.println("子类构造方法");
    }
}
