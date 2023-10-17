package 클래스더알아보기.chap6열거형.ex01;

import static 클래스더알아보기.chap6열거형.ex01.ButtonMode.LIGHT;
import static 클래스더알아보기.chap6열거형.ex01.ButtonSpace.SINGLE;

public class Button {
    private ButtonMode buttonMode = LIGHT;
    private ButtonSpace buttonSpace = SINGLE;

    public void setButtonMode(ButtonMode buttonMode) {
        this.buttonMode = buttonMode;
    }

    public void setButtonSpace(ButtonSpace buttonSpace) {
        this.buttonSpace = buttonSpace;
    }
}
