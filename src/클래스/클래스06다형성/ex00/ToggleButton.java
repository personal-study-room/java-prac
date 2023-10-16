package 클래스.클래스06다형성.ex00;

public class ToggleButton extends Button {

    boolean on;

    public ToggleButton(String print, boolean on) {
        super(print); // 부모의 생성자 호출. 부모의 생성자가 가장 앞에 와야한다.
        this.on = on;
    }

    @Override
    public void func() {
        super.func(); // 부모에서 정의한 메소드 호출
        // super : 부모 클래스 그 자체
        this.on = !this.on;
        System.out.println(
                "대문자 입력: " + (this.on? "ON": "OFF")
        );
    }

    public void tglFunc() {
        System.out.println("toggle button 기능");
    }
}
