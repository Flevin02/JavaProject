package cn.tedu.Personal.Test;

public class GoodTest {
    public static void main(String[] args) {

        Good[] arr = new Good[3];

        Good good1 = new Good("01", "苹果", 5, 2000);
        Good good2 = new Good("02", "牛奶", 2.5, 5000);
        Good good3 = new Good("03", "泡面", 1.5, 120);

        arr[0] = good1;
        arr[1] = good2;
        arr[2] = good3;

        for (Good good : arr) {
            System.out.println(good.getId() + ", " + good.getName() + ", " + good.getPrize() + ", " + good.getInventory());
        }

    }
}
