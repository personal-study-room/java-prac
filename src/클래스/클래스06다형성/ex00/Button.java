package 클래스.클래스06다형성.ex00;

public class Button {
    private String print;

    public Button(String print) {
        this.print = print;
    }

    public void func() {
        System.out.println(print + " 입력 적용");
    }
}
