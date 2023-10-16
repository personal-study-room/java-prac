package 클래스.클래스05상속.ex02;

public class ShutDownButton extends Button{
    public ShutDownButton() {
        super("ShutDown");
    }

    // 부모의 메소드를 overriding
    @Override
    public void func() {
        System.out.println("프로그램 종료");
    }
}
