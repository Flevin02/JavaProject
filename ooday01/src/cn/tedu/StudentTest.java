package cn.tedu;
//学生类的测试类
public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生对象
        Student zs = new Student();
        //访问成员变量
        zs.name = "zhangsan";
        zs.age = 24;
        zs.address = "河北廊坊";
        //调用方法
        zs.study();
        zs.sayHi();

        Student ls = new Student();
        ls.name = "lisi";
        ls.age = 26;
        ls.address = "黑龙江佳木斯";
        ls.study();
        ls.sayHi();

        //1)创建了一个学生对象
        //2)给成员变量赋默认值
        Student ww = new Student();
        ww.study();
        ww.sayHi();
    }
}


















