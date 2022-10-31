package cn.flevin.selfproject.interfacedemo2;

public class BasketballAthlete extends Athletes {

    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }

}
