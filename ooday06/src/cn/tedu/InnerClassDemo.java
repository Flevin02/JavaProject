package cn.tedu;
//成员内部类的演示
public class InnerClassDemo {
    public static void main(String[] args) {
        Mama m = new Mama();
        //Baby b = new Baby(); //编译错误，内部类对外不具备可见性
    }
}

class Mama{ //外部类
    private String name;
    void create(){
        Baby b = new Baby(); //正确，内部类对象只能在外部类中创建
    }
    class Baby{ //内部类
        void showName(){
            System.out.println(name);
            System.out.println(Mama.this.name); //Mama.this指代外部类对象
            //System.out.println(this.name); //编译错误，this指代当前Baby对象，Baby类中没有name
        }
    }
}
















