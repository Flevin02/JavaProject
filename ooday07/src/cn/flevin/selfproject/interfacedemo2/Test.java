package cn.flevin.selfproject.interfacedemo2;

public class Test {
    public static void main(String[] args) {

        PingPongCoach pingPongCoach = new PingPongCoach("zhangsan", 50);

        pingPongCoach.speakEnglish();
        pingPongCoach.teach();


        PingPongAthlete Athlete = new PingPongAthlete("lisi", 20);
        System.out.println(Athlete.getName() + ", " + Athlete.getAge());
        Athlete.speakEnglish();
        Athlete.study();

    }
}
