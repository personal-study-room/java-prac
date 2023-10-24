package 함수형프로그래밍.메소드참조;

import 클래스더알아보기.chap4익명클래스.ex02.OnClickListener;

public class Button {
    private Runnable onClickListener;
    private String text;

    public Button(String text) {
        this.text = text;
    }
    public Button(String text, String sound) {
        this(text);
        onClickListener = () -> System.out.println(sound + " " + sound);
    }
    public String getText() { return text; }
    public void setOnClickListener(Runnable onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        onClickListener.run();
    }
}
