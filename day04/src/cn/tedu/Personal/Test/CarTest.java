package cn.tedu.Personal.Test;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        //1.创建一个数组用于存储三个汽车对象
        Car[] arr = new Car[3];

        //2.创建汽车对象,数据来自键盘输入
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car car = new Car();
            //录入品牌
            System.out.println("请输入品牌:");
            car.setBrand(in.next());
            //录入价格
            System.out.println("请输入价格:");
            car.setPrize(in.nextInt());
            //录入颜色
            System.out.println("请输入颜色:");
            car.setColor(in.next());
            arr[i] = car;
        }
        //遍历数组
        for (Car car : arr) {
            System.out.println(car.getBrand() + ", " + car.getPrize() + ", " + car.getColor());
        }

    }
}
