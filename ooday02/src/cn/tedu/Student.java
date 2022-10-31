package cn.tedu;
//学生类
public class Student {
    String name;
    int age;
    String address;
    //构造方法
    Student(String name,int age,String address){
        this.name = name;       //zs.name="zhangsan"
        this.age = age;         //zs.age=25
        this.address = address; //zs.address="LF"
    }

    void study(){
        System.out.println(name+"在学习...");
    }
    void sayHi(){
        System.out.println("大家好，我叫"+this.name+"，今年"+this.age+"岁了，家住"+this.address);
    }
}
















