package 클래스.클래스06다형성.ex00;

public class Main {
    public static void main(String[] args) {
        //  💡 가능 - 자식 클래스는 부모 클래스에 속함
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3 = new ToggleButton("CapsLock", true);

        //  ⚠️ 불가
//        ShutDownButton button4 = new Button("Enter");
//        ToggleButton button5 = new ShutDownButton();

        // 타입이 부모 타입이므로, overriding 메서드와 부모 필드에만 접근이 가능하다.
//        button3.tglFunc();
//        boolean buttonOn = button3.on;


        //  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button button : buttons) {
            //  ⭐️ 모든 Button들은 func 메소드를 가지므로
            button.func();
        }


        // instanceof

        Button buttonA = new Button("버튼");
        ToggleButton toggleButtonB = new ToggleButton("토글", true);
        ShutDownButton shutDownButtonC = new ShutDownButton();

        //  true
        boolean typeCheck1 = buttonA instanceof Button;
        boolean typeCheck2 = toggleButtonB instanceof Button;
        boolean typeCheck3 = shutDownButtonC instanceof Button;

        //  false
        boolean typeCheck4 = buttonA instanceof ShutDownButton;
        boolean typeCheck5 = buttonA instanceof ToggleButton;

        //  ⚠️ 컴파일 에러
//        boolean typeCheck6 = toggleButtonB instanceof ShutDownButton;
//        boolean typeCheck7 = shutDownButtonC instanceof ToggleButton;

        Button[] buttonss = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttonss) {
            if (btn instanceof ShutDownButton) continue; // ⭐️
            btn.func();
        }
    }
}
