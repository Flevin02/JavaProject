package cn.flevin.tedu;
/*
 *@author: FLevin
 *@program:JavaProject
 *@Date: 2022/10/19
 *@description: 学生类
 */

public class Student extends Person{

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setName("flevin");
        System.out.println(student);
    }

}
