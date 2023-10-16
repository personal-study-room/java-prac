package 클래스.클래스04접근제어자.ex02;

import 클래스.클래스04접근제어자.ex01.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

//        String pb = smartPhone.powerButton; // ⚠️ 불가()
        //왜? default는 동일한 패키지에서만 사용가능

        String ss = smartPhone.sdCardSlot;

        //------------------------------
        Button button1 = new Button('1', 1);

//        Button.mode = "OCEAN"; // ⚠️ 불가 why? private 이므로
        Button.switchMode();

//        button1.space = 3; // ⚠️ 불가 why? private 이므로
        button1.setSpace(3);
        button1.setSpace(-1); // 걸러짐. setter 내부 로직에 의해서 걸러짐

//        char button1Print = button1.print; // ⚠️ 불가 why? private 이므로
        String button1Info = button1.getButtonInfo();
    }
}
