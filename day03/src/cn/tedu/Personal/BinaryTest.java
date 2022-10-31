package cn.tedu.Personal;

public class BinaryTest {
    public static void main(String[] args) {

        int[][] binaryArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int total = 0;
        //遍历二维数组，得到每一个一维数组并求和
        for (int i = 0; i < binaryArr.length; i++) {
            int sum = getSum(binaryArr[i]);
            System.out.println("第" + (i + 1) + "个季度的营业额为" + sum);
            total += sum;
        }
        System.out.println("全年总额为" + total);

    }

    private static int getSum(int[] arr) {

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        return sum;

    }

}
