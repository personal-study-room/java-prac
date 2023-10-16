package 클래스.클래스08추상클래스.ex02;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button(2, "Enter");
        Switch switch1 = new Switch(3, true);
        DropDown dropDown1 = new DropDown(5, new String[]{
                "이름 오름차순", "이름 내림차순",
                "크기 오름차순", "크기 내림차순",
                "날짜 오름차순", "날짜 내림차순"
        });

        clickFormElement(button1);
        clickFormElement(switch1);
        clickFormElement(switch1);
        clickFormElement(switch1);

        clickFormElement(dropDown1);
    }

    // 다형성을 적용하여 func() 메서드를 실행하도록 만듦
    private static void clickFormElement(FormElement fe) {
        fe.func();
    }
}
