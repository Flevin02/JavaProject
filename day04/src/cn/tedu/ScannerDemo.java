package cn.tedu;
import java.util.Scanner; //1.导入了一个扫描仪
//Scanner的演示
public class ScannerDemo {
    public static void main(String[] args) {
        //创建ScoreLevel，接收用户输入的成绩score(double)，并输出
        //创建CommandBySwitch，接收用户输入的命令command(int)，并输出
        Scanner scan = new Scanner(System.in); //2.新建了一个扫描仪叫scan
        System.out.println("请输入年龄:");
        int age = scan.nextInt(); //3.扫描一个整数并赋值给age
        System.out.println("请输入商品价格:");
        double price = scan.nextDouble(); //3.扫描一个小数并赋值给price
        System.out.println("年龄为:"+age+"，商品价格为:"+price);
    }
}



























