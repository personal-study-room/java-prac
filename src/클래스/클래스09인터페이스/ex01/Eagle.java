package 클래스.클래스09인터페이스.ex01;

public class Eagle extends Bird implements Flyer, Hunter{
    @Override
    public void fly() {
        System.out.println("날개로 비행");
    }

    @Override
    public void hunt() {
        System.out.println(position + ": 토끼 사냥");
    }
}
