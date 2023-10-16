package 클래스.클래스03클래스_정적_필드와_메서드.ex03;

public class Button {
    static String mode = "LIGHT";

    static void switchMode() {
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }

    char print;
    int space = 1;

    public Button(char print, int space) {
        this.print = print;
        this.space = space;
    }

    void place() {
        System.out.printf(
                "표시: %c, 공간: %d, 모드: %s%n",
                print, space, mode
        );
    }
}
