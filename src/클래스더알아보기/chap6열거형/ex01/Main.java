package 클래스더알아보기.chap6열거형.ex01;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();

        button1.setButtonMode(ButtonMode.DARK);
        button1.setButtonSpace(ButtonSpace.TRIPLE);

        // 아래와 같은 오용이 방지됨
//        button1.setButtonMode(ButtonSpace.SINGLE);
    }
}
