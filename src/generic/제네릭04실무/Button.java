package generic.제네릭04실무;

public class Button extends FormElement implements Clickable {

    @Override
    public void onClick() {
        func();
    }

    @Override
    void func() {
        System.out.println("버튼 클릭");
    }
}
