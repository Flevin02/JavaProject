package cn.flevin.selfproject.interfacedemo2;

public class PingPongAthlete extends Athletes implements SpeakEnglish {

    public PingPongAthlete() {
    }

    public PingPongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("学英语");
    }

    @Override
    public void study() {
        System.out.println("打乒乓球");
    }
}
