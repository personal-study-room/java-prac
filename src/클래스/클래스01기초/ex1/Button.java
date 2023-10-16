package 클래스.클래스01기초.ex1;

public class Button {

    char print;
    int space;
    String mode;

    public Button(char print, int space, String mode) {
        this.print = print;
        this.space = space;
        this.mode = mode;
    }

    void place() {
        System.out.printf(
                "표시: %c, 공간: %s, 모드: %s%n",
                print, space, mode
        );
    }
}
