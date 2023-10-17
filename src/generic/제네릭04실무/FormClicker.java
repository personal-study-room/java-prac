package generic.제네릭04실무;

public class FormClicker<T extends FormElement & Clickable> {
    private T formElem;

    public FormClicker(T formElem) {
        this.formElem = formElem;
    }

    // 조건의 클래스와 인터페이스의 기능 사용 가능!!!
    // 왜? -> 자료형을 특정해 주었기 때문에,
    public void printElemMode() {
        formElem.printMode();
    }

    public void clickElem() {
        formElem.onClick(); // -> 내부적으로 func() 메서드를 실행시킴
    }
}
