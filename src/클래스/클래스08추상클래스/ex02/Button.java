package 클래스.클래스08추상클래스.ex02;

public class Button extends FormElement{

    private String print;

    public Button(int space, String print) {
        super(space);
        this.print = print;
    }

    @Override
    void func() {
        System.out.println(print + "입력 적용");
    }
}
