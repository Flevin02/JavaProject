package cn.tedu.Personal.Test;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {

        //1.定义数组用于存储三个手机对象
        Phone[] phones = new Phone[3];

        //获取来自键盘的数据
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < phones.length; i++) {
            Phone phone = new Phone();
            //输入品牌
//            System.out.println("请输入品牌:");
//            phone.setBrand(in.next());
            //输入价格
            System.out.println("请输入价格:");
            phone.setPrize(in.nextInt());
            //输入颜色
//            System.out.println("请输入颜色:");
//            phone.setColor(in.next());

            phones[i] = phone;
        }

        int prizeSum = 0;
        for (Phone phone : phones) {
            prizeSum += phone.getPrize();
        }
        System.out.println("平均价格为" + prizeSum / phones.length);
    }
}
