package cn.flevin.self;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCountPowNum());
        System.out.println(getCountPowNum2());

    }

    public static int getCountPowNum() {
        int bit, tenth, last, count = 0;
        for (int i = 100; i < 999; i++) {
            bit = i % 10;
            tenth = i / 10 % 10;
            last = i / 100;
            if (Math.pow(bit, 3) + Math.pow(tenth, 3) + Math.pow(last, 3) == i) {
                count++;
            }
        }
        return count;
    }

    public static int getCountPowNum2() {
        int bit, tenth, count = 0;
        for (int i = 10; i < 99; i++) {
            bit = i % 10;
            tenth = i / 10 ;
            if (Math.pow(bit, 3) + Math.pow(tenth, 3) == i) {
                count++;
            }
        }
        return count;
    }

}
