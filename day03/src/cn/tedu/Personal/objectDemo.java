package cn.tedu.Personal;

public class objectDemo {
    public static void main(String[] args) {

        Phone phone = new Phone("iphone", 5000);
        System.out.println(phone.brand + "\n" + phone.prize);
        phone.Call();
        phone.Play();
    }

    public static class Phone {

        public Phone(String brand, double prize) {
            this.brand = brand;
            this.prize = prize;
        }

        //属性
        String brand;
        double prize;

        //行为
        public void Call() {
            System.out.println("calling");
        }

        public void Play() {
            System.out.println("playing");
        }

    }

}

