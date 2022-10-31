package cn.flevin.args;

/**
 * @Project JavaProject
 * @Date 10/26/2022
 * @Author FLevin
 * @Description 计算n个数据的和
 */

public class ArgDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(getSum());
    }

    public static int getSum(int... values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }

}
