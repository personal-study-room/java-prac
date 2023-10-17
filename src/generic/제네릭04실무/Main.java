package generic.제네릭04실무;

public class Main {
    public static void main(String[] args) {
        FormClicker<Button> fc1 = new FormClicker<>(new Button());
        FormClicker<Switch> fc2 = new FormClicker<>(new Switch(true));

        fc1.printElemMode();
        fc2.clickElem();

        // 조건에 부합하지 않는 클래스 사용 불가
//        FormClicker<T> fc3 = new FormClicker<>(new TextInput());
        // 불가. 왜? new TextInput 클래스는 Clickable과 FormElement를 모두 구현 및 상속하고 있지 않아서

        // 아래도 동일한 이유로 안된다.
//        FormClicker<T> fc4 = new FormClicker<>(new HyperLink());
    }
}
