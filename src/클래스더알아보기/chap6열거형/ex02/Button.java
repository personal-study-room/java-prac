package 클래스더알아보기.chap6열거형.ex02;

public class Button {

    // 해당 mode와 space는 Button이라는 클래스에서만 사용될 것임
    // 이런 경우, Button 클래스 내부에 클래스로 만들어서 관리를 하기도 함
    // 장점 : 사용되는 곳에서 관리한다는 점에서 유리
    // 단점 : 코드의 응집도가 높아짐. 확장성은 떨어진다.
    enum Mode {LIGHT, DARK,}
    enum Space {SINGLE, DOUBLE, TRIPLE,}

    private Mode mode = Mode.LIGHT;
    private Space space = Space.SINGLE;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}
