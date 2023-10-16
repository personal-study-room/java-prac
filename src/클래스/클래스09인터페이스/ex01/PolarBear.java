package 클래스.클래스09인터페이스.ex01;

public class PolarBear extends Mamal implements Hunter, Swimmer{
    public PolarBear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + ": 물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }
}
