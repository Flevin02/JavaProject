package cn.tedu.Personal.Test;

public class GirlFriendTest {
    public static void main(String[] args) {

        GirlFriend[] girlArr = new GirlFriend[4];

        GirlFriend girl1 = new GirlFriend("小花",22,"唱歌");
        GirlFriend girl2 = new GirlFriend("小兰",18,"跳舞");
        GirlFriend girl3 = new GirlFriend("小七",19,"写作");
        GirlFriend girl4 = new GirlFriend("小丁",21,"打游戏");


        girlArr[0] = girl1;
        girlArr[1] = girl2;
        girlArr[2] = girl3;
        girlArr[3] = girl4;

        int sum = 0;
        for (GirlFriend gf : girlArr) {
            sum += gf.getAge();
        }
        double avg = (double) (sum / girlArr.length);
        System.out.println("平均年龄:" + avg);

        int count = 0;
        for (GirlFriend gf : girlArr) {
            int girlAge = gf.getAge();
            if (girlAge < avg) {
                count++;
                System.out.println("姓名:" + gf.getName() + " 年龄:" + gf.getAge() + " 爱好:" + gf.getHobbies());
            }
        }
        System.out.println(count);

    }
}
