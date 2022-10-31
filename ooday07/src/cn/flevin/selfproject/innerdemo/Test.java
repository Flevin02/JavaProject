package cn.flevin.selfproject.innerdemo;

public class Test {
    public static void main(String[] args) {

        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写swim");
            }
        };

        s.swim();

        Animal a = new Animal() {

            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };
        a.eat();
        Animal dog = new Dog();
        dog.eat();

    }
}
