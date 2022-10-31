package cn.tedu.Personal;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("FLevin", 12, "男生");

//        student1.setName("FLevin");
//        student1.setAge(12);
//        student1.setGender("男生");

        System.out.println(student1.getName() + "\n" + student1.getAge() + "\n" + student1.getGender());

        student1.Sleep();
        student1.eat();

        System.out.println("*****************");

        Student student2 = new Student("02", 20, "女生");

//        student2.setName("02");
//        student2.setAge(20);
//        student2.setGender("女生");

        System.out.println(student2.getName() + "\n" + student2.getAge() + "\n" + student2.getGender());

        student2.Sleep();
        student2.eat();

    }
}
