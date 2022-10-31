package cn.tedu.Personal;

public class Student {
    //属性
    private String name;
    private int age;
    private String gender;
    //如果没有定义构造方法，系统将给出一个默认的无参构造方法
    //如果定义了构造方法，系统将不会提供默认的构造方法


    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //对每一个私有化的成员变量，需要提供get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("非法参数！");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void Sleep() {
        System.out.println("sleeping");
    }

    public void eat() {
        System.out.println("eating");
    }

}
